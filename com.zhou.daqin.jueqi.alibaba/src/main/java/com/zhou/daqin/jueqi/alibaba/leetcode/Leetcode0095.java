package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0095 {

    public List<TreeNode> generateTrees(int n) {
        if( n== 0) {
            return new ArrayList<>();
        }
        return genTreeList(1,n);
    }

    private List<TreeNode> genTreeList (int start, int end) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        if (start > end) {
            list.add(null);
        }
        for(int idx = start; idx <= end; idx++) {
            List<TreeNode> leftList = genTreeList(start, idx - 1);
            List<TreeNode> rightList = genTreeList(idx + 1, end);
            for (TreeNode left : leftList) {
                for(TreeNode right: rightList) {
                    TreeNode root = new TreeNode(idx);
                    root.left = left;
                    root.right = right;
                    list.add(root);
                }
            }
        }
        return list;
    }
}
