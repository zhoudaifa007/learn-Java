package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;
import org.junit.Test;

public class Leetcode0297Tests {

    @Test
    public void test1(){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        Leetcode0297 leetcode0297 = new Leetcode0297();
        String res = leetcode0297.serialize(treeNode1);
        TreeNode treeNode = leetcode0297.deserialize(res);
        System.out.println("ok");
    }

}
