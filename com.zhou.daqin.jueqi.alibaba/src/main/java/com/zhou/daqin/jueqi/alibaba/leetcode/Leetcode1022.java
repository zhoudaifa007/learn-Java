package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Leetcode1022 {

    public int sumRootToLeaf(TreeNode root) {
        int sum = 0;
        List<String> list  = binaryTreePaths(root);
        for(String str: list) {
           int num = hexToInt(str);
            sum = sum + num;
        }
        return sum;
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if(root == null) return paths;

        if(root.left == null && root.right == null){
            paths.add(root.val+"");
            return paths;
        }

        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val  + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val  + path);
        }

        return paths;

    }

    private int hexToInt(String str) {
        int num = 0;
        int m = 1;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt( str.length() - i - 1);
            num = num + (c - '0') * m;
            m = m *2;
        }
        return num;
    }
}
