package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;
import org.junit.Test;

import java.util.List;

public class Leetcode0652Tests {

    @Test
    public void test1() {
        Leetcode0652 leetcode0652 = new Leetcode0652();

        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;

        TreeNode treeNode3 = new TreeNode(4);
        treeNode1.left = treeNode3;

        TreeNode treeNode4 = new TreeNode(2);
        TreeNode treeNode5 = new TreeNode(4);

        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
//        TreeNode treeNode6 = new TreeNode(4);
//        treeNode4.left = treeNode6;

       List<TreeNode> list = leetcode0652.findDuplicateSubtrees(treeNode);
       System.out.println(list);

    }


    @Test
    public void test2() {
        int i = 4 ;
        long l = i << 16;
        System.out.println(l);
    }
}
