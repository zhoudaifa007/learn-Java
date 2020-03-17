package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0250 {
    public int countUnivalSubtrees(TreeNode root) {
        return getId(root)[0];
    }

    private int[] getId(TreeNode root) {
        if (root == null) {
            int[] array = new int[2];
            array[0] = 0;
            array[1] = 1;
            return array;
        }

        int[] left = getId(root.left);
        int[] right = getId(root.right);

        if(left[1] == 1 && right[1] == 1) {
            int[] arr = new int[2];
            arr[1] = 1;
            if(root.left != null && root.val != root.left.val ) {
                arr[1] = 0;
            }
            if(root.right != null && root.val != root.right.val ) {
                arr[1] = 0;
            }

            if(arr[1] == 1) {
                arr[0] = 1 + left[0] + right[0];
            } else {
                arr[0] = left[0] + right[0];
            }
            return  arr;

        } else {
            int[] arr = new int[2];
            arr[0] = left[0] + right[0];
            arr[1] = 0;
            return arr;
        }
    }
}
