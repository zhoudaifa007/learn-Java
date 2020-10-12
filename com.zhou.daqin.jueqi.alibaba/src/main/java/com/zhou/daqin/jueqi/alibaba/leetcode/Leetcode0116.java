package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0116 {
    public TreeNode connect(TreeNode root) {
        //如果是null或者叶子节点直接返回
        if(root == null || root.left == null)
            return root;
        //处理当前节点的左节点，先处理左节点还是右节点影响不大
        root.left.next = root.right;
        if(root.next != null){
            root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }

    //这种解法比较直观
    public TreeNode connect2(TreeNode root) {
        if(root == null) {
            return root;
        }
        List<TreeNode> cur = new ArrayList<>();
        cur.add(root);
        while(cur.size() > 0) {
            int size = cur.size();
            List<TreeNode> next = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = cur.get(i);
                if(node.left != null) next.add(node.left);
                if(node.right != null) next.add(node.right);
            }

            for(int i = 0 ; i < size  - 1; i++) {
                cur.get(i).next = cur.get(i + 1);
            }
            cur = next;
        }
        return root;
    }

    public TreeNode connect1(TreeNode root) {
        TreeNode head = null; //head of the next level
        TreeNode prev = null; //the leading node on the next level
        TreeNode cur = root;  //current node of current level

        while (cur != null) {

            while (cur != null) { //iterate on the current level
                //left child
                if (cur.left != null) {
                    if (prev != null) {
                        prev.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    prev = cur.left;
                }
                //right child
                if (cur.right != null) {
                    if (prev != null) {
                        prev.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    prev = cur.right;
                }
                //move to next node
                cur = cur.next;
            }

            //move to next level
            cur = head;
            head = null;
            prev = null;
        }
        return root;
    }
}
