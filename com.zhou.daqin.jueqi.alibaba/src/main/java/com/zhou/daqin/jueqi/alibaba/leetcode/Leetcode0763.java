package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode0763 {
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        char[] array = S.toCharArray();

        Map<Character,int[]> map = new HashMap<>();

        for(int i = 0; i < array.length; i++) {
            char c = array[i];
            int[] range = map.get(c);
            if(range == null) {
                range = new int[]{i, i};
            } else {
                range[1] = i;
            }
            map.put(c, range);
        }

        List<int[]> list = new ArrayList<int[]>();
        int[] num = new int[]{-1, -1};
        for(int i = 0; i < array.length; i++) {
            if(i > num[1]) {
                num = new int[]{i,-1};
                list.add(num);
            }

            char c = array[i];
            int[] t = map.get(c);
            if(t[1] >= num[1]) {
                num[1] = t[1];
            }
        }

        List<Integer> res = new ArrayList<>();

        for(int[] q: list) {
            int offset = q[1] - q[0] + 1;
            res.add(offset);
        }


        return res;
    }
}
