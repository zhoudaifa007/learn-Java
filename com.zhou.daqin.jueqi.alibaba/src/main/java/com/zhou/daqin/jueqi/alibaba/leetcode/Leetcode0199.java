package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        List<List<Integer>> levelRes = levelTraval(root);
        if(levelRes != null && levelRes.size() > 0) {
            for(List<Integer> line: levelRes) {
                ans.add(line.get(line.size() - 1));
            }
        }

        return ans;
    }

    //层序遍历
    private List<List<Integer>> levelTraval(TreeNode root) {
        List<List<Integer>> ans = new ArrayList();
        if(root == null) {
            return ans;
        }

        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);

        while(cur.size() > 0) {
            int size = cur.size();
            //保存下一行的节点
            List<TreeNode> next = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = cur.get(i);
                if(node.left != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
            }

            //保存当前行的值
            List<Integer> line = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                line.add(cur.get(i).val);
            }

            cur = next;
            ans.add(line);

        }

        return  ans;
    }
}
