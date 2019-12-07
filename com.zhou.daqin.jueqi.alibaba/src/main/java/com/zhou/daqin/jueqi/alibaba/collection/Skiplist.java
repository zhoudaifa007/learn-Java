package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Skiplist {

    private static final double DEFAULT_PROB = 0.5;
    private final Random rand = new Random();
    private final List<Node> sentinels = new ArrayList<>();

    {
        sentinels.add(new Node(Integer.MIN_VALUE));
    }

    //搜索存在否，是最简单的
    public boolean search(int target) {
        Node smallerOrEquals = getSmallerOrEquals(target);
        return smallerOrEquals.val == target;
    }

    //添加节点，以加层最为复杂
    public void add(int num) {
        Node cur = getSmallerOrEquals(num);
        // cur 最下层，比他小或者等于 num
        final Node toInsert = new Node(num);
        append(cur, toInsert);
        // populate the level
        populateLevelUp(toInsert);
    }

    private void populateLevelUp(final Node toInsert) {
        Node curPrev = toInsert.left, cur = toInsert;

        while (flipCoin()) {
            //找到左侧第一个有向上指针的节点
            while (curPrev.left != null && curPrev.up == null) {
                curPrev = curPrev.left;
            }
            //一直没有找到
            if (curPrev.up == null) {
                final Node newSentinel = new Node(Integer.MIN_VALUE);
                curPrev.up = newSentinel;
                newSentinel.down = curPrev;
                sentinels.add(curPrev.up);
            }
            curPrev = curPrev.up;
            //新建向上节点
            final Node newNode = new Node(toInsert.val);
            cur.up = newNode;
            newNode.down = cur;
            cur = cur.up;

            //连接两个上层节点
            curPrev.right = cur;
            cur.left = curPrev;
        }
    }

    //最底层插入
    private void append(Node prev, Node cur) {
        //保存右侧节点
        final Node next = prev.right;

        //连接左侧节点
        prev.right = cur;
        cur.left = prev;

        //连接右侧节点
        if (next != null) {
            next.left = cur;
            cur.right = next;
        }
    }

    public boolean erase(int num) {
        final Node toRemove = getSmallerOrEquals(num);
        if (toRemove.val != num) {
            return false;
        }
        Node cur = toRemove;
        //从下往上删除节点
        while (cur != null) {
            final Node prev = cur.left, next = cur.right;
            prev.right = next;
            if (next != null) {
                next.left = prev;
            }
            cur = cur.up;
        }
        return true;
    }

    private Node getSmallerOrEquals(final int target) {
        Node cur = getSentinel();
        while (cur != null) {
            //向下搜索的条件，否则向右搜索
            if (cur.right == null || cur.right.val > target) {
                if (cur.down == null) break;
                cur = cur.down;
            } else {
                cur = cur.right;
            }
        }
        return cur;
    }

    //掷硬币,是否加层
    private boolean flipCoin() {
        return rand.nextDouble() < DEFAULT_PROB;
    }

    //获取最顶层的哨兵
    private Node getSentinel() {
        return sentinels.get(sentinels.size() - 1);
    }

    public String toString() {
        Node node = sentinels.get(0);
        final StringBuilder sb = new StringBuilder();
        while (node != null) {
            Node itr = node;
            while (itr != null) {
                sb.append(itr.val).append(",");
                itr = itr.up;
            }
            sb.append("\n");
            node = node.right;
        }
        return sb.toString();
    }

    private static final class Node {
        private final int val;
        private Node left, right, up, down;

        private Node(int val) {
            this.val = val;
        }
    }
}

