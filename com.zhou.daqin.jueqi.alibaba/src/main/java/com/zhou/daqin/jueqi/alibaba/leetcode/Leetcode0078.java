package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subHelper(nums,0, res,new ArrayList<>());
        return res;
    }

    /**
     * 属于combination
     * @param nums
     * @param index
     * @param res
     * @param cur
     */
    private void subHelper(int[] nums, int index, List<List<Integer>> res, List<Integer> cur) {
        res.add(new ArrayList<>(cur));
        for(int i = index; i < nums.length; i++) {
            cur.add(nums[i]);
            subHelper(nums, i + 1, res, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
