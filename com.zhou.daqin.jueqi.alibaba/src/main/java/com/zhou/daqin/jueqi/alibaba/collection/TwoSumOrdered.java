package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daifa on 2018/4/5.
 */
public class TwoSumOrdered {

    public int[] twoSum(int[] numbers, long target) {
        int[] result = null;
        if (numbers == null || numbers.length < 2) {
            return result;
        }
        int start = 0;
        int end = numbers.length - 1;
        while (start < end){
            long sum = numbers[start] + numbers[end];
            if(sum > target) {
                end = end - 1;
            }  else if(sum < target){
                start = start + 1;
            } else {
                result = new int[2];
                result[0] = start;
                result[1] = end;
            }
        }
        return result;
    }
}
