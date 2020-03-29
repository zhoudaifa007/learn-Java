package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode0090 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subHelper(nums,0, res,new ArrayList<>(), true);
        return res;
    }

    private void subHelper(int[] nums, int index, List<List<Integer>> res, List<Integer> cur,boolean flag) {
        if( index == nums.length) {
            res.add(new ArrayList<>(cur));
        } else {
            subHelper(nums, index + 1, res, cur, false);
            if(flag || nums[index] != nums[index -1]) {
                cur.add(nums[index]);
                subHelper(nums, index + 1, res, cur, true);
                cur.remove(cur.size() - 1);
            }
        }
    }

}
