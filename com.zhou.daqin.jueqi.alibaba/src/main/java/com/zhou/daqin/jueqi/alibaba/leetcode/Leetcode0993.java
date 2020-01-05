package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode0993 {

    public boolean isCousins(TreeNode root, int x, int y) {
        List<List<TreeNode>> lists = levelOrder(root);
        NodeInfo info1 = null;
        NodeInfo info2 = null;
        int i = 1;
        for(List<TreeNode> treeNodeList:lists) {
            for(TreeNode treeNode:treeNodeList) {
                if(treeNode.left != null   ) {
                    if(treeNode.left.val == x) {
                        info1 = new NodeInfo();
                        info1.level = i;
                        info1.node = treeNode;
                    }
                    if(treeNode.left.val == y) {
                        info2 = new NodeInfo();
                        info2.level = i;
                        info2.node = treeNode;
                    }
                }
                if(treeNode.right != null ) {
                    if(treeNode.right.val == x) {
                        info1 = new NodeInfo();
                        info1.level = i;
                        info1.node = treeNode;
                    }
                    if(treeNode.right.val == y) {
                        info2 = new NodeInfo();
                        info2.level = i;
                        info2.node = treeNode;
                    }
                }
            }
            i = i + 1;
        }
        if(info1 != null && info2 != null && info1.level == info2.level && info1.node.val != info2.node.val ) {
            return true;
        }else {
            return false;
        }
    }

    private List<List<TreeNode>> levelOrder(TreeNode root) {
        List<List<TreeNode>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(TreeNode curr, List<List<TreeNode>> sol, int level) {
        if (curr == null) {
            return;
        }

        //每次某一层第一次被遍历的时候创建list
        if (sol.size() <= level) {
            List<TreeNode> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }

        //获取该层列表，插入数据
        List<TreeNode> collection = sol.get(level);

        collection.add(curr);

        TreeNode left = curr.left;
        if (left != null) {
            travel(left, sol, level + 1);
        }

        TreeNode right = curr.right;
        if (right != null) {
            travel(right, sol, level + 1);
        }

    }

    static class NodeInfo {
        int level;
        TreeNode node;
    }
}
