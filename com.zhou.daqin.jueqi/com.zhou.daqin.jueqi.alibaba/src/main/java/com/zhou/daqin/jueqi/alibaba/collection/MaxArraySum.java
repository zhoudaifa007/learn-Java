package com.zhou.daqin.jueqi.alibaba.collection;

/**
 * Created by Daifa on 2018/4/7.
 */
public class MaxArraySum {

    public static long getMax(int[] array) {

        long maxSum = Long.MIN_VALUE;
        long currentSum = -1L;
        for(int i = 0; i < array.length; i++) {
            if(currentSum < 0) {
                currentSum = array[i];
            }
            else {
                currentSum = currentSum +array[i];
            }
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return  maxSum;
    }
}
