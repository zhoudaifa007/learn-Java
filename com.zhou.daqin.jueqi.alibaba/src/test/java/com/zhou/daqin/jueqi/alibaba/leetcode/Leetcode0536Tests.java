package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.TreeNode;
import org.junit.Test;

public class Leetcode0536Tests {

    @Test
    public void test1() {
        String s = "1(2)(3)";
        Leetcode0536 leetcode0536 = new Leetcode0536();
        TreeNode treeNode = leetcode0536.str2tree(s);
        System.out.println(treeNode);
    }

    @Test
    public void test2() {
        String s = "4(2(3)(1))(6(5))";
        Leetcode0536 leetcode0536 = new Leetcode0536();
        TreeNode treeNode = leetcode0536.str2tree(s);
        System.out.println(treeNode);
    }

    @Test
    public void test3() {
        String s = "4(2(3)(1))(6(5)(7))";
        Leetcode0536 leetcode0536 = new Leetcode0536();
        TreeNode treeNode = leetcode0536.str2tree(s);
        System.out.println(treeNode);
    }
}
