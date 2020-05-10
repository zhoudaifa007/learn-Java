package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode0253Tests {

    @Test
    public void test1() {
        Leetcode0253 leetcode0253 = new Leetcode0253();
        int[][] a =  {{0, 30},{5, 10},{15, 20}};
        int num =   leetcode0253.minMeetingRooms(a);
        System.out.println(num);
    }
}
