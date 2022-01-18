package com.zhou.daqin.jueqi.alibaba.review;

import java.util.TreeSet;

public class SwapGetSmallerNum {
    //题目：给定一个非负整数，交换一次数字中的任意两位。 返回刚好比给定的数字小
    //
    //示例：
    //
    //输入：4321
    //正确输出：4312
    //
    //错误：4231 (比给定的数字小有多个  需要返回最大的那个)
    //9533469
    //9433569

    public int getSmallerNum(int num) {
        String s  = String.valueOf(num);
        char[] charArr = s.toCharArray();
        int[] numArr = new int[charArr.length];
        for(int i = 0; i < charArr.length; i++) {
            numArr[i] = charArr[i] - '0';
        }

        int leftIndex = -1;

        TreeSet<Integer> set = new TreeSet<>();
        for(int i = numArr.length - 1; i > 0; i--) {
            set.add(numArr[i]);
            if(numArr[i - 1] > numArr[i]) {
                leftIndex = i - 1;
                break;
            }
        }

        if(leftIndex == -1) {
            return -1;
        }

        int rightNum =  set.lower(numArr[leftIndex]);
        int rightIndex = -1;
        for(int i = leftIndex + 1; i < numArr.length; i++) {
            if(numArr[i] == rightNum) {
                rightIndex = i;
            }
        }

        int tmp = numArr[leftIndex];
        numArr[leftIndex] = numArr[rightIndex];
        numArr[rightIndex]= tmp;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < numArr.length; i++) {
            stringBuilder.append(numArr[i]);
        }

        String s1 = stringBuilder.toString();
        return Integer.valueOf(s1);
    }
}
