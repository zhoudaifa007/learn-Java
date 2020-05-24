package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1302 {
    public int deepestLeavesSum(TreeNode root) {
        int sum = 0;
        List<List<Integer>> list = zigzagLevelOrder1(root);

        if(list != null && list.size() != 0) {
            List<Integer> ans = list.get(list.size() -1);
            for(Integer integer: ans) {
                sum = sum + integer;
            }
        }
        return sum;
    }

    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        List<TreeNode> cur = new ArrayList<>();
        List<TreeNode> next = new ArrayList<>();
        cur.add(root);
        int count = 0;
        while(cur.size() > 0) {
            int size = cur.size();
            next = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = cur.get(i);
                if(node.left != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
            }
            List<Integer> line = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (count % 2 == 0) {
                    line.add(cur.get(i).val);
                } else {
                    line.add(0,cur.get(i).val);
                }
            }
            cur = next;
            count  = count + 1;
            ans.add(line);
        }
        return ans;
    }
}
