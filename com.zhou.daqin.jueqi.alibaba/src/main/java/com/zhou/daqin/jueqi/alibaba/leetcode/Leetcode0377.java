package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 该题目标是求个数，不是求列表
 * 求个数的问题，常见的就是DP
 * 如果把问题转化为求列表，又该如何做
 */

public class Leetcode0377 {


    /**
     * 本题上台阶的有点类似，上台阶的问题最终抽象为斐波那契数列
     * 找出递归方程等于成功的一般，但是递归方程和斐波那契数列一样，存在重复计算的问题
     * 最终时间复杂度太高,2的N次方，N表示nums的长度
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4Rec(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += combinationSum4Rec(nums, target - nums[i]);
            }
        }
        return res;
    }

    /**
     * 为了避免递归时时间负责太高的问题，我们需要将之前计算的结果保存下来
     * 称之为记忆化递归
     */
    private int[] dp;
    public int combinationSum4(int[] nums, int target) {
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        return helper(nums, target);
    }

    private int helper(int[] nums, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += helper(nums, target - nums[i]);
            }
        }
        dp[target] = res;
        return res;
    }

    /**
     * 使用动态规划的方式，理解起来很直观，时间复杂度有点高，
     * 因为target较大时，有些重复计算，时间复杂度为N * M
     */
    public int combinationSum4DP(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        dp = new int[target + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;

        for(int i = 1; i <= target; i++)
            for (int j = 0; j < nums.length; j++) {
                if(i >= nums[j]) {
                 dp[i] = dp[i] + dp[i - nums[j]];
                }
            }

        return dp[target];
    }

    /**
     * 获取列表的方式如下
     * 虽然Leetcode将此题归类为combination，但实际上是permutation
     * @param nums
     * @param target
     * @return
     */
    public int combinationSum4GetList(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        helper2(nums, target, res, new ArrayList<>());
        res.forEach( t -> System.out.println(JSON.toJSONString(t)));
        return res.size();
    }

    private void helper2(int[] nums, int target, List<List<Integer>> resList, List<Integer> cur) {
        if(target == 0) {
            resList.add(new ArrayList<>(cur));
        }
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                cur.add(nums[i]);
                helper2(nums, target - nums[i], resList, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }
}
