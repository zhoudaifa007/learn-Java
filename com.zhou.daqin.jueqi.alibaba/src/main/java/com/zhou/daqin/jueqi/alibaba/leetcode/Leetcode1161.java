package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1161 {
    public int maxLevelSum(TreeNode root) {
        if(root == null) {
            return -1;
        }

        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        int maxLevel = 1;
        int maxValue = Integer.MIN_VALUE;
        int curlevel = 0;
        while(cur.size() != 0) {

            List<TreeNode> next = new ArrayList<>();
            curlevel = curlevel + 1;
            int curValue = 0;
            for(TreeNode treeNode: cur) {
                curValue = curValue + treeNode.val;
                if(treeNode.left != null) {
                    next.add(treeNode.left);
                }
                if(treeNode.right != null) {
                    next.add(treeNode.right);
                }
            }
            if(curValue > maxValue ) {
                maxValue = curValue;
                maxLevel = curlevel;
            }

            cur = next;
        }
        return maxLevel;
    }
}
