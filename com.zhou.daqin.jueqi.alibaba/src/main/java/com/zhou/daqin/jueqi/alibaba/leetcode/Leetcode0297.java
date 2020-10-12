package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// https://www.youtube.com/watch?v=OtqN9siio0g&t=622s&ab_channel=AndroidBabies%E5%AE%89%E5%8D%93%E5%A4%A7%E5%AE%9D%E8%B4%9D%E4%BB%AC

public class Leetcode0297 {

    private static final String spliter = ",";
    private static final String NN = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            buildString(node.left, sb);
            buildString(node.right,sb);
        }
    }
    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }


    public String serialize1(TreeNode root) {
        if(root == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            if(node == null) {
                sb.append("null");
            } else {
                sb.append(node.val);
                q.offer(node.left);
                q.offer(node.right);
            }
            sb.append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public TreeNode deserialize1(String data) {
        if(data.equals("")) {
            return null;
        }
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        for(int i = 1; i < arr.length; i++) {
            TreeNode node = q.poll();
            if(!arr[i].equals("null")) {
                TreeNode left = new TreeNode(Integer.parseInt(arr[i]));
                node.left = left;
                q.offer(left);
            }

            if(!arr[++i].equals("null")) {
                TreeNode right = new TreeNode(Integer.parseInt(arr[i]));
                node.right = right;
                q.offer(right);
            }
        }
        return root;
    }
}
