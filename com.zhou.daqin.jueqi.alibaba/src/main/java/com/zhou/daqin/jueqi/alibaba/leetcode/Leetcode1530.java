package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode1530 {
    int result = 0;

    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return result;
    }

    int[] dfs(TreeNode root, int distance) {
        if (root == null)
            return new int[distance + 1];
        if (root.left == null && root.right == null) {
            int res[] = new int[distance + 1];
            res[1] = 1;
            return res;
        }
        int[] left = dfs(root.left, distance);
        int[] right = dfs(root.right, distance);
        for (int l = 1; l < distance + 1; l++) {
            for (int r = 1; r < distance + 1; r++) {
                if (l + r <= distance)
                    result += left[l] * right[r];
            }
        }
        int res[] = new int[distance + 1];
        //shift by 1
        for (int i = res.length - 2; i >= 1; i--) {
            res[i + 1] = left[i] + right[i];
        }

        return res;
    }
}
