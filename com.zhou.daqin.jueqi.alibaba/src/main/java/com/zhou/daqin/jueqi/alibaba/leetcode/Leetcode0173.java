package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode0173 {

    Queue<TreeNode> treeNodeQueue = new LinkedList<>();

    public Leetcode0173(TreeNode root) {
        init(root);
    }

    private void init(TreeNode root) {
        if(root == null) {
            return;
        }
        init(root.left);
        treeNodeQueue.add(root);
        init(root.right);
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode treeNode = treeNodeQueue.poll();
        return treeNode.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !treeNodeQueue.isEmpty();
    }
}
