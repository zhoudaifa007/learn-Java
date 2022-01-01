package com.zhou.daqin.jueqi.alibaba.contest;

import java.util.Arrays;

public class Leetcode5831 {


    public static long numberOfWeeks(int[] milestones) {

        if (milestones == null || milestones.length == 0) {
            return 0L;
        }

        Arrays.sort(milestones);

        if (milestones.length == 1) {
            return 1L;
        }
        long num = milestones[0];
        for (int i = 1; i < milestones.length; i++) {
            num = num + Math.min(milestones[i], num + 1);
        }

        return num;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        System.out.println(numberOfWeeks(a));
        int a1[] = {5, 1, 2};
        System.out.println(numberOfWeeks(a1));
        int a3[] = {5, 9, 4, 4, 8, 9, 9, 8, 7, 3};
        System.out.println(numberOfWeeks(a3));
    }
}
