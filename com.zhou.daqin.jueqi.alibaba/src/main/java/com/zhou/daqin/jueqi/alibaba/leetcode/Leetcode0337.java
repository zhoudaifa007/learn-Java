package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0337 {
    public int rob(TreeNode root) {
        return Math.max(helper(root)[0],helper(root)[1]);
    }

    private int[] helper(TreeNode node) {
        if(node == null) {
            return new int[2];
        }
        int[] array = new int[2];

        int[] arrayLeft = helper(node.left);
        int[] arrayRight = helper(node.right);
        array[0] = arrayLeft[1] + arrayRight[1] + node.val;
        array[1] = Math.max(arrayLeft[0],arrayLeft[1]) + Math.max(arrayRight[0],arrayRight[1]) ;
        return array;
    }

}
