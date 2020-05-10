package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0079Tests {

    @Test
    public void test1() {
        Leetcode0079 leetcode0079 = new Leetcode0079();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        boolean flag = leetcode0079.exist(board,"SEE");
        System.out.println(flag);
    }

    @Test
    public void test2() {
        Leetcode0079 leetcode0079 = new Leetcode0079();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        boolean flag = leetcode0079.exist(board,"ABCCED");
        System.out.println(flag);
    }

    @Test
    public void test3() {
        Leetcode0079 leetcode0079 = new Leetcode0079();
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        boolean flag = leetcode0079.exist(board,"ABCB");
        System.out.println(flag);
    }

    @Test
    public void test4() {
        Leetcode0079 leetcode0079 = new Leetcode0079();
        char[][] board = {
                {'a','b'},
                {'c','d'}
        };

        boolean flag = leetcode0079.exist(board,"cdba");
        System.out.println(flag);
    }
}
