package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Leetcode0671 {

    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new HashSet<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> {
            return b - a;
        });
        inorderTranversal(root, set);
        for (Integer num : set) {
            priorityQueue.offer(num);
        }
        while (priorityQueue.size() > 2) {
            priorityQueue.poll();
        }

        if (priorityQueue.size() < 2) {
            return -1;
        }
        return priorityQueue.poll();
    }

    private void inorderTranversal(TreeNode node, Set<Integer> set) {
        if (node == null) {
            return;
        }
        inorderTranversal(node.left, set);
        set.add(node.val);
        inorderTranversal(node.right, set);
    }
}
