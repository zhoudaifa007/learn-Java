package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by Daifa on 2018/4/15.
 */
public class Leetcode813 {

    public double largestSumOfAverages(int[] A, int K) {
        int N = A.length;
        double[][] memo = new double[N + 1][N + 1];
        double cur = 0;
        for (int i = 0; i < N; ++i) {
            cur += A[i];
            memo[i + 1][1] = cur / (i + 1);
        }
        return search(N, K, A, memo);
    }

    public double search(int n, int k, int[] A, double[][] memo) {
        if (memo[n][k] > 0) return memo[n][k];
        double cur = 0;
        for (int i = n - 1; i > 0; --i) {
            cur += A[i];
            memo[n][k] = Math.max(memo[n][k], search(i, k - 1, A, memo) + cur / (n - i));
        }
        return memo[n][k];
    }

    public double largestSumOfAverages1(int[] A, int K) {
        final int n = A.length;
        double[][] dp = new double[K + 1][n + 1];
        double[] sums = new double[n + 1];
        for (int i = 1; i <= n; ++i) {
            sums[i] = sums[i - 1] + A[i - 1];
            dp[1][i] = sums[i] / i;
        }

        //k的取值范围是2到K
        for (int k = 2; k <= K; ++k)
            //i的取值范围是k到N
            for (int i = k; i <= n; ++i)
                //j的取值范围是k-1到i
                for (int j = k - 1; j < i; ++j) {
                    dp[k][i] = Math.max(dp[k][i], dp[k - 1][j] + (sums[i] - sums[j]) / (i - j));
                }

        return dp[K][n];
    }
}
