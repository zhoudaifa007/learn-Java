package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Leetcode0979 {

    private int sum2 = 0;

    public int distributeCoins(TreeNode root) {
        int sum = 0;
        Map<TreeNode, Integer> map = new HashMap<>();
        helper(root,map);
        Iterator<Map.Entry<TreeNode, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<TreeNode, Integer> entry = it.next();
            sum = sum + Math.abs(entry.getValue());
        }
        return sum;
    }

    //后续遍历，求每个节点的balance
    private int helper(TreeNode treeNode, Map<TreeNode, Integer> map) {
        if (treeNode == null) {
            return 0;
        }

        int left = helper(treeNode.left, map);
        int right = helper(treeNode.right, map);
        //平衡值的定义
        int balance = left + right + treeNode.val - 1;
        map.put(treeNode, balance);
        return balance;
    }

}
