package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/boundary-of-binary-tree/discuss/565486/Java-leftview-leavies-right-view
public class Leetcode0545 {
    List<Integer> res = new ArrayList<>();

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if (root == null) return res;
        res.add(root.val);
        leftBoundary(root.left);
        leaf(root.left);
        leaf(root.right);
        rightBoundary(root.right);
        return res;
    }

    private void leaf(TreeNode node) {
        if (node == null) return;
        if (isLeaf(node)) res.add(node.val);
        leaf(node.left);
        leaf(node.right);
    }

    private void leftBoundary(TreeNode node) {
        if (node == null || isLeaf(node)) return;
        //从上往下遍历
        res.add(node.val);
        if (node.left == null) leftBoundary(node.right);
        else leftBoundary(node.left);
    }

    private void rightBoundary(TreeNode node) {
        if (node == null || isLeaf(node)) return;
        if (node.right == null) rightBoundary(node.left);
        else rightBoundary(node.right);
        //从底层忘上遍历
        res.add(node.val);
    }

    private boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
