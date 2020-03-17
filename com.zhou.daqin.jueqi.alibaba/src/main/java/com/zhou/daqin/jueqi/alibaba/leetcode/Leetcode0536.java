package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;


public class Leetcode0536 {
    public TreeNode str2tree(String s) {
        if(s == null || s.equals("")) {
            return null;
        }

        return get(s);
    }

    private TreeNode get(String s) {
        if(s.equals("")) {
            return null;
        }
        int index1 = s.indexOf("(");
        if(index1 == -1) {
            TreeNode treeNode = new TreeNode(Integer.valueOf(s));
            return treeNode;
        }

        int val = Integer.valueOf(s.substring(0, index1));
        TreeNode treeNode1 = new TreeNode(val);

        int index2 = getIndex(s);
        if(index2 == s.length() - 1) {
            String leftStr = s.substring(index1 + 1, s.length() -  1);
            treeNode1.left = get(leftStr);
            treeNode1.right = null;
        } else {
            String leftStr = s.substring(index1 +1 , index2);
            String rightStr = s.substring(index2 + 2, s.length() - 1);
            treeNode1.left = get(leftStr);
            treeNode1.right = get(rightStr);
        }
        return treeNode1;
    }

    private int getIndex(String s) {
        int count = 0;
        boolean flag = false;
        for(int i = 0 ; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '(') {
                count++;
                flag = true;
            }

            if(c == ')'){
                count--;
            }
            if(count ==0 && flag) {
                return i;
            }
        }
        return -1;
    }

}
