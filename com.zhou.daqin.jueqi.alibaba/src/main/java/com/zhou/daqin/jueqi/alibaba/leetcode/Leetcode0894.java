package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0894 {

    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> treeNodeList = new ArrayList<>();
        if (N % 2 == 0) {
            return treeNodeList;
        }

        if(N == 1) {
            TreeNode treeNode = new TreeNode(0);
            treeNodeList.add(treeNode);
            return treeNodeList;
        }

        for(int i = 1; i <= N; i = i + 2) {
            for(TreeNode treeNode1: allPossibleFBT( i))
                for (TreeNode treeNode2:allPossibleFBT(N -i - 1)) {
                    TreeNode treeNode = new TreeNode(0);
                    treeNode.left = treeNode1;
                    treeNode.right = treeNode2;
                    treeNodeList.add(treeNode);
                }
        }
        return treeNodeList;
    }
}
