package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0098 {

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    public boolean helper(TreeNode root, Integer max, Integer min) {
        if(root == null) return true;

        if ((max != null && root.val >= max) || (min != null && root.val <= min))
            return false;

        boolean left = helper(root.left, root.val, min);
        boolean right = helper(root.right, max, root.val);
        return left && right;
    }
}
