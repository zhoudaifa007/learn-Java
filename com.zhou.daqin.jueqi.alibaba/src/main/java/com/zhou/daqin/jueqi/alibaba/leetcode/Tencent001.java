package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.Arrays;

public class Tencent001 {

    private int[] mArray;

    public int getNum(int[] array, int m){
        int len = Integer.MAX_VALUE;
        int templen = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {

            int j = i;
            init(m);
            while (j < array.length) {
                mArray[array[j]] = 1;
                if(all()) {
                    templen = j - i + 1;
                    break;
                }
                j++;
            }
             if(templen < len) {
                 len = templen;
             }
        }

        if(len == Integer.MAX_VALUE) {
            return -1;
        }
        return len;
    }

    private void init(int m) {
        mArray = new int[m + 1];
    }

    private boolean all() {
       return Arrays.stream(mArray).sum() == mArray.length - 1;
    }


}