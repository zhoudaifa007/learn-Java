package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;
import org.junit.Test;

public class Leetcode0111Tests {

    @Test
    public void test1() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        treeNode.right = treeNode1;
        Leetcode0111 leetcode0111 = new Leetcode0111();
       int h =  leetcode0111.minDepth(treeNode);
        System.out.println(h);
    }
}
