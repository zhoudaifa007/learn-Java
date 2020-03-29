package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode0047 {

    /**
     * permute 剔重
     * @param nums
     * @return
     */
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        Arrays.sort(nums);
        permuteUniqueHelper(nums, res, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }

    private void permuteUniqueHelper(int[] num, List<List<Integer>> res, List<Integer> cur, boolean[] used) {
        if(num.length == cur.size()) {
            res.add(new ArrayList<>(cur));
        } else {
            int preNum = num[0] - 1;
            for(int i  = 0; i < num.length; i++) {
                if(!used[i] && num[i] != preNum) {
                    used[i] = true;
                    preNum = num[i];
                    cur.add(num[i]);
                    permuteUniqueHelper(num, res, cur, used);
                    used[i] = false;
                    cur.remove(cur.size() -1);
                }
            }
        }
    }
}
