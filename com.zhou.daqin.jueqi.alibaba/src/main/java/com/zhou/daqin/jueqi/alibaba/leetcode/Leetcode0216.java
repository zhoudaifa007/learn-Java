package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0216 {

    /**
     * combination排列
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combination(ans, new ArrayList<Integer>(), k, 1, n);
        return ans;
    }

    private void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            combination(ans, comb, k, i+1, n-i);
            comb.remove(comb.size() - 1);
        }
    }

    /**
     * permutation, 深度遍历
     * @param k
     * @param n
     * @return
     */
    public List<List<Integer>> permutationSum(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        permutationHelper(ans, new ArrayList<Integer>(), k, n, new boolean[10]);
        return ans;
    }

    private void permutationHelper(List<List<Integer>> ans, List<Integer> comb, int k, int n, boolean[] flag) {
        if (comb.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(comb);
            ans.add(li);
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if(!flag[i]) {
                comb.add(i);
                flag[i] = true;
                permutationHelper(ans, comb, k,n-i,flag);
                flag[i] = false;
                comb.remove(comb.size() - 1);
            }
        }
    }
}
