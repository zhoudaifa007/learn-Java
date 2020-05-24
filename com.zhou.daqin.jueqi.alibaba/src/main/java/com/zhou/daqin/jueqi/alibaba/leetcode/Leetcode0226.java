package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0226 {
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }

    private TreeNode helper(TreeNode treeNode) {
        if(treeNode == null) {
            return null;
        }
        TreeNode left = treeNode.left;
        TreeNode right = treeNode.right;

        treeNode.left = helper(right);
        treeNode.right = helper(left);
        return treeNode;
    }
}
