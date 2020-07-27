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

    //类似于0，1背包的做法
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

    public List<List<Integer>> subsetsWithDup2(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subsetsWithDupHelper(nums,0, res,new ArrayList<>());
        return res;
    }

    //combination之后，去掉重复的，这种做法更通用
    private void subsetsWithDupHelper(int[] nums, int index, List<List<Integer>> res, List<Integer> cur) {
        res.add(new ArrayList<>(cur));
        for(int i = index; i < nums.length; i++) {
            //当前元素不是首元素，且与前面的元素相同
            if( i != index && nums[i] == nums[i -1]) continue;
            cur.add(nums[i]);
            subsetsWithDupHelper(nums, i + 1, res, cur);
            cur.remove(cur.size() - 1);
        }
    }

}
