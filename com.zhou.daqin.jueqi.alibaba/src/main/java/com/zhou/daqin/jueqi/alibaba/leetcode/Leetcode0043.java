package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;

public class Leetcode0043 {

    public String multiply(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int[] a1 = new int[length1];
        int[] a2 = new int[length2];
        for(int i = 0; i < length1; i++) {
            //低位反转
            a1[length1 - 1 -i] = num1.charAt(i) - '0';
        }

        for(int i = 0; i < length2; i++) {
            //低位反转
            a2[length2 - 1 - i] = num2.charAt(i) - '0';
        }
        String s = "";
        int[] res = multiply(a1,a2);

        if (Arrays.stream(res).sum() == 0) {
            return "0";
        }

        int length = res.length;
        for(int i = length - 1; i >=0; i--) {
            if(i == length - 1 ) {
                if(res[i] !=0) {
                    s = s + res[i];
                }
            } else {
                s = s + res[i];
            }
        }

        return s;
    }

    public static int[] multiply(int[] num1, int[] num2) {
        int lengthOfNum1 = num1.length;
        int lengthOfNum2 = num2.length;
        //如果num1和num2的长度分别为n1，n2，那么它们相乘的结果位数最大为n1+n2
        int[] result = new int[lengthOfNum1 + lengthOfNum2];
        //num[i]*num2[j]的结果存在result[i+j]上，最后再处理进制问题
        for (int i = 0; i < lengthOfNum1; i++) {
            for (int j = 0; j < lengthOfNum2; j++) {
                result[i + j] += num1[i] * num2[j];
            }
        }
        // 处理进制问题
        for (int i = 0; i < lengthOfNum1 + lengthOfNum2 - 1; i++) {
            if (result[i] >= 10) {
                result[i + 1] += result[i] / 10;
                result[i] = result[i] % 10;
            }
        }
        return result;
    }
}
