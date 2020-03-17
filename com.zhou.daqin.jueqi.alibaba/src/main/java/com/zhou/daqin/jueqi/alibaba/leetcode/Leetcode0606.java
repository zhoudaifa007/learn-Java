package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0606 {
    public String tree2str(TreeNode t) {
        return getString(t);
    }

    private String getString(TreeNode root) {
        if (root == null) {
            return "";
        }

        if (root.right != null && root.left != null) {
            return root.val + "(" + getString(root.left) + ")" + "(" + getString(root.right) + ")";
        } else if (root.right != null && root.left == null) {
            return root.val + "(" + getString(root.left) + ")" + "(" + getString(root.right) + ")";
        } else if (root.right == null && root.left != null) {
            return root.val + "(" + getString(root.left) + ")";
        } else  {
            return String.valueOf(root.val);
        }
    }
}
