package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0572 {


    public boolean isSubtree(TreeNode s, TreeNode t) {
        String str1 = tree2str(s);
        String str2 = tree2str(t);
        if (str1.contains(str2)) {
            return true;
        }
        return false;
    }

    public String tree2str(TreeNode t) {
        return getString(t);
    }

    private String getString(TreeNode root) {
        if (root == null) {
            return "";
        }

        if (root.right != null || root.left != null) {
            return root.val + "(" + getString(root.left) + ")" + "(" + getString(root.right) + ")";
        } else {
            return "("+ root.val + ")";
        }
    }
}
