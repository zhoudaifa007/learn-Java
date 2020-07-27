package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0105Tests {

    @Test
    public void test1() {
       int[] preorder = {3,9,20,15,7};
       int[] inorder = {9,3,15,20,7};
        Leetcode0105 leetcode0105 = new Leetcode0105();
        leetcode0105.buildTree(preorder,inorder);
    }
}
