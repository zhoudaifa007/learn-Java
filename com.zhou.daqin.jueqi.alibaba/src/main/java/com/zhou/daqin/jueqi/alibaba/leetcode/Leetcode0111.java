package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.Node;
import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode0111 {

    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        List<List<TreeNode>> list = levelOrder(root);
        int i  = 0;
        for(List<TreeNode> nodeList:list) {
            i = i + 1;
            for(TreeNode treeNode:nodeList) {
                if (treeNode.left == null & treeNode.right == null) {
                    return i;
                }
            }
        }
        return i;
    }

    private List<List<TreeNode>> levelOrder(TreeNode root) {
        List<List<TreeNode>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(TreeNode curr, List<List<TreeNode>> sol, int level) {
        if (curr == null) {
            return;
        }

        //每次某一层第一次被遍历的时候创建list
        if (sol.size() <= level) {
            List<TreeNode> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }

        //获取该层列表，插入数据
        List<TreeNode> collection = sol.get(level);

        collection.add(curr);

        TreeNode left = curr.left;
        if (left != null) {
            travel(left, sol, level + 1);
        }

        TreeNode right = curr.right;
        if (right != null) {
            travel(right, sol, level + 1);
        }

    }
}
