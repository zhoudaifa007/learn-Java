package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0105 {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        return helper(preorder, 0 , inorder, 0, length -1);
    }

    private TreeNode helper(int[] preorder, int s1, int[] inorder, int s2, int e2) {
        if( s2 > e2 || s1 > preorder.length - 1 || s2 > preorder.length - 1) {
            return null;
        }
        int rootVal = preorder[s1];
        TreeNode treeNode = new TreeNode(rootVal);
        int index = -1;
        for(int i = s2; i <= e2; i++) {
            if(rootVal == inorder[i]) {
                index = i;
                break;
            }
        }
        int offset = index - s2;

        treeNode.left = helper(preorder, s1 + 1, inorder, s2, index - 1);
        treeNode.right = helper(preorder, s1 + offset + 1, inorder, index + 1, e2);
        return treeNode;
    }
}
