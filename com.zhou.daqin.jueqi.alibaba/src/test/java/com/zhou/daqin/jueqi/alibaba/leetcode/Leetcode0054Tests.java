package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Leetcode0054Tests {

    @Test
    public void test1() {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Leetcode0054 leetcode0054 = new Leetcode0054();
        List<Integer> ans = leetcode0054.spiralOrder(array);
        ans.forEach(System.out::println);

    }
}
