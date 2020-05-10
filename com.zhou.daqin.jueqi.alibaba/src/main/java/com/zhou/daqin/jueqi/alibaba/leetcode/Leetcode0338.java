package com.zhou.daqin.jueqi.alibaba.leetcode;



import java.util.ArrayList;
import java.util.List;

public class Leetcode0338 {


    public int[] countBits(int num) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= num; i++) {
            list.add(hammingWeight(i));
        }
        int[] array = new int[list.size()];
        for(int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }

    public int[] countBits2(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) f[i] = f[i >> 1] + (i & 1);
        return f;
    }


}
