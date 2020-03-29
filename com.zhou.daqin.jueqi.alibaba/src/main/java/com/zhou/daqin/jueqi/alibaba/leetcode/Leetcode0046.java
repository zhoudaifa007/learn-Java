package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode0046 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permuteHelper(nums,res, new ArrayList<>(), new HashSet<>());
        return res;
    }

    private void permuteHelper(int[] num,List<List<Integer>> res, List<Integer> cur, Set<Integer> set) {
        if(cur.size() == num.length) {
            res.add(new ArrayList<>(cur));
        } else {
            for(int i = 0; i < num.length; i++) {
                if(!set.contains(num[i])) {
                    cur.add(num[i]);
                    set.add(num[i]);
                    permuteHelper(num,res, cur, set);
                    cur.remove(cur.size() -1);
                    set.remove(num[i]);
                }
            }
        }
    }
}
