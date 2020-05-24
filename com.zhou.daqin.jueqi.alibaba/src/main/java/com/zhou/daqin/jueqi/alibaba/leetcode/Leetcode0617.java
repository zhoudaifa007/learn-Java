package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return mergeTreesHelper(t1, t2);
    }

    private TreeNode mergeTreesHelper(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode node = new TreeNode(val);
        node.left = mergeTreesHelper(t1 == null ? null: t1.left, t2 == null? null : t2.left);
        node.right = mergeTreesHelper(t1 == null ? null: t1.right, t2 == null? null : t2.right);
        return node;
    }
}
