package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class Leetcode2008 {

    public long maxTaxiEarnings(int n, int[][] rides) {
        Arrays.sort(rides, (a, b) -> (a[1] - b[1]));
        TreeMap<Integer, Long> dp = new TreeMap<>();
        dp.put(0, 0L);
        for (int[] ride : rides) {
            long currEarning = ride[1] - ride[0] + ride[2] + dp.floorEntry(ride[0]).getValue();
            if (currEarning > dp.lastEntry().getValue()) {
                dp.put(ride[1], currEarning);
            }
        }
        return dp.lastEntry().getValue();
    }


    public long maxTaxiEarnings1(int n, int[][] rides) {
        List<int[]>[] graph; // // key: end, value: list of rides ends at key
        long[] dp;

        dp = new long[n + 1];

        graph = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] ride : rides) {
            graph[ride[1]].add(new int[]{ride[0], ride[1] - ride[0] + ride[2]});
        }

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1];
            for (int[] e : graph[i]) {
                dp[i] = Math.max(dp[i], dp[e[0]] + e[1]);
            }
        }

        return dp[n];
    }
}
