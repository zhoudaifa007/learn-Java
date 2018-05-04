package com.zhou.daqin.jueqi.alibaba.number;

import com.zhou.daqin.jueqi.alibaba.leetcode.LargestNumber;
import org.junit.Test;

/**
 * Created by Daifa on 2018/4/7.
 */
public class LargestNumberTest {
    @Test
    public void test1(){
        int[] array = {0, 0, 0};
        String  str = LargestNumber.getMax(array);
        System.out.println(str);
    }
}
