package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

public class Leetcode0106 {

    public TreeNode buildTree(int[] inorder,int[] postorder) {
        int length = inorder.length;
        return helper(inorder, 0 , length - 1, postorder, length -1);
    }

    private TreeNode helper(int[] inorder, int s1, int e1, int[] postorder, int e2) {
        if(s1 > e1 || e2 < 0) {
            return null;
        }
        int rootVal = postorder[e2];
        TreeNode treeNode = new TreeNode(rootVal);
        int index = 0;
        for(int i = s1; i <= e1; i++) {
            if(rootVal == inorder[i]) {
                index = i;
                break;
            }
        }
        int offset = e1 - index;

        treeNode.left = helper(inorder, s1, index - 1, postorder, e2 - 1 - offset);
        treeNode.right = helper(inorder, index + 1, e1, postorder, e2 - 1);
        return treeNode;
    }
}
