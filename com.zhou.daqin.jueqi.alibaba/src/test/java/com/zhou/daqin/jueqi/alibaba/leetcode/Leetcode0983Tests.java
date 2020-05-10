package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0983Tests {

    @Test
    public void test1() {
        int[] days= {1,2,3,4,5,6,7,8,9,10,30,31};
        int[] costs = {2,7,15};
        Leetcode0983 leetcode0983 = new Leetcode0983();
        int i =  leetcode0983.mincostTickets(days, costs);
        System.out.println(i);
    }
}
