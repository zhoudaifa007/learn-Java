package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode0139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length() == 0) {
            return false;
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        Set<String> set  = new HashSet<>(wordDict);

        for(int i = 1; i <= s.length(); i++)
            for (int j = 0 ; j < i; j++) {
                String temp = s.substring(j,i);
                if(set.contains(temp) && dp[j]) {
                    dp[i] = true;
                    break;
                }
            }

        return dp[s.length()];
    }
}
