package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Leetcode0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> sol = new ArrayList<>();
        travel(root, sol, 0);
        return sol;
    }

    private void travel(TreeNode curr, List<List<Integer>> sol, int level) {
        if (curr == null) {
            return;
        }

        //每次某一层第一次被遍历的时候创建list
        if (sol.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            sol.add(newLevel);
        }

        //获取该层列表，插入数据
        List<Integer> collection = sol.get(level);
        if (level % 2 == 0) {
            collection.add(curr.val);
        } else {
            collection.add(0, curr.val);
        }

        travel(curr.left, sol, level + 1);
        travel(curr.right, sol, level + 1);
    }

    //bfs的队列可能有一个，也可能用是多个
    public List<List<Integer>> zigzagLevelOrder1(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        int count = 0;
        while(cur.size() > 0) {
            int size = cur.size();
            List<TreeNode> next  = new ArrayList<>();
            List<Integer> line = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = cur.get(i);
                if (count % 2 == 0) {
                    line.add(node.val);
                } else {
                    line.add(0, node.val);
                }
                if(node.left != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
            }
            cur = next;
            count  = count + 1;
            ans.add(line);
        }
        return ans;
    }
}
