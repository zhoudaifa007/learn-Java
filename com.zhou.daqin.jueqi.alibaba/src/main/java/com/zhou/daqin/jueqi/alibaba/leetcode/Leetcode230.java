package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode230 {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList();
        inorderTraversal(root,list,k);
        return list.get(k - 1);
    }

    private void inorderTraversal(TreeNode root, List<Integer> list, int k) {
        if(root == null) {
            return;
        }
        inorderTraversal(root.left, list, k);
        int val = root.val;
        list.add(val);
        inorderTraversal(root.right, list,k);
    }
}
