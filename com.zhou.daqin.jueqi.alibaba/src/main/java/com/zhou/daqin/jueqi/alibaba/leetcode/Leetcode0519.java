package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//这个题和买股票的有点像
public class Leetcode0519 {

    public int findMinDifference(List<String> timePoints) {
        List<Integer> nums = new ArrayList<>();
        for (String time : timePoints) {
            String[] t = time.split(":");
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            nums.add(h * 60 + m);
        }

        Collections.sort(nums);

        int minGap = Integer.MAX_VALUE;
        for(int i = 1; i < nums.size(); i++) {
            minGap = Math.min(minGap, nums.get(i) - nums.get(i - 1));
            if(minGap == 0) {
                break;
            }
        }

        //处理环形的情况
        int corner = nums.get(0) + (1440 - nums.get(nums.size()-1));
        return Math.min(minGap, corner);
    }
}
