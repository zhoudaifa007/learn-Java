package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode0039 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        combinationSum(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }

    /**
     * 首先題目的意思是可以重复，所以start的位置i
     * @param result
     * @param cur
     * @param candidates
     * @param target
     * @param start
     */
    public void combinationSum(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start) {
        if (target > 0) {
            for (int i = start;i < candidates.length;i++) { // not using the condition "target >= candidates[i]"
                //能做这一步操作的前提，是已经排序了
                if(candidates[i] > target) {
                    break;
                }
                cur.add(candidates[i]);
                //最关键的一步，起始位置还是i，不是i + 1，因为可以重复
                combinationSum(result, cur, candidates, target-candidates[i],i);
                cur.remove(cur.size() - 1);
            }
        }
        if (target == 0) result.add(new ArrayList<Integer>(cur));
    }

    //如果改成不能重复，那么递归函数怎么写
    public void combinationSum2(List<List<Integer>> result, List<Integer> cur, int[] candidates, int target, int start) {
        if (target > 0) {
            for (int i = start;i < candidates.length;i++) { // not using the condition "target >= candidates[i]"
                if(candidates[i] > target) {
                    break;
                }
                cur.add(candidates[i]);
                //最关键的一步，起始位置还是i，是i + 1
                combinationSum(result, cur, candidates, target-candidates[i],i + 1);
                cur.remove(cur.size() - 1);
            }
        }
        if (target == 0) result.add(new ArrayList<Integer>(cur));
    }
}
