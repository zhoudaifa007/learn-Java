package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0460Tests {

    @Test
    public void test1() {
        Leetcode0460 leetcode0460 = new Leetcode0460(3);
//        [[3],[2,2],[1,1],[2],[1],[2],[3,3],[4,4],[3],[2],[1],[4]
        leetcode0460.put( 2,2);
        leetcode0460.put( 1,1);
        leetcode0460.get(2);
        leetcode0460.get(1);
        leetcode0460.get(2);
        leetcode0460.put(3,3);
        leetcode0460.put(4,4);
        leetcode0460.get(3);
        leetcode0460.get(2);
        leetcode0460.get(1);
        leetcode0460.get(4);

    }

    @Test
    public void test2() {
//        [[2],[1,1],[2,2],[1],[3,3],[2],[3],[4,4],[1],[3],[4]]
        Leetcode0460 leetcode0460 = new Leetcode0460(2);
        leetcode0460.put( 1,1);
        leetcode0460.put( 2,2);
        leetcode0460.get(1);

        leetcode0460.put( 3,3);
        leetcode0460.get(2);
        leetcode0460.get(3);
        leetcode0460.put(4,4);
        leetcode0460.get(1);
        leetcode0460.get(3);
        leetcode0460.get(4);
    }
}
