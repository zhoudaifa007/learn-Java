package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;
import org.junit.Test;

public class Leetcode671Tests {

    @Test
    public void test1(){
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(5);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        TreeNode treeNode4 = new TreeNode(5);
        TreeNode treeNode5 = new TreeNode(7);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        Leetcode671 leetcode297 = new Leetcode671();
        int value = leetcode297.findSecondMinimumValue(treeNode1);
        System.out.println("ok");
    }
}
