package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=aBL-aNWNmB4
public class Leetcode0040 {

    public List<List<Integer>> combinationSum2(int[] cand, int target) {
        Arrays.sort(cand);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        combinationSum2Helper(cand, 0, target, path, res);
        return res;
    }

    void combinationSum2Helper(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList(path));
            return;
        }
        if (target < 0) return;

        for (int i = cur; i < cand.length; i++) {
            //当前元素的值和之前的值相同，且不是首元素的时候才需要跳过，比如2，2，3， target=7时，此时第二个2不能跳过过
            if (i != cur && cand[i] == cand[i - 1]) continue;
            //优化执行效率
            if (cand[i] > target) {
                break;
            }
            path.add(cand[i]);
            //i + 1,表示元素不能重复使用
            combinationSum2Helper(cand, i + 1, target - cand[i], path, res);
            path.remove(path.size() - 1);

        }
    }
}
