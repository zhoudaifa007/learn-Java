package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1229 {

    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a,b)->a[0]-b[0]); // sort increasing by start time
        Arrays.sort(slots2, (a, b)->a[0]-b[0]);
        int index1 = 0;
        int index2 = 0;
        int len1 = slots1.length;
        int len2 = slots2.length;

        int[] res = new int[]{-1,-1};

        while( index1 < len1 && index2 < len2) {

            int[] s1 = slots1[index1];
            int[] s2 = slots2[index2];

            if(s1[1] <= s2[1]) {
                if(s1[1] <= s2[0]) {
                    index1++;
                } else {
                    int v = Math.max(s1[0], s2[0]);
                    int d = s1[1] - v;
                    if(d>= duration) {
                        res = new int[]{v, v + duration};
                        break;
                    } else {
                        index1++;
                    }
                }
            } else {
                if(s2[1] <= s1[0]) {
                    index2++;
                } else {
                    int v = Math.max(s1[0], s2[0]);
                    int d = s2[1] - v;
                    if(d>= duration) {
                        res = new int[]{v, v + duration};
                        break;
                    } else {
                        index2++;
                    }
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        if(res[0] == -1 ) {
            return list;
        } else {
            list.add(res[0]);
            list.add(res[1]);
        }

        return list;
    }
}
