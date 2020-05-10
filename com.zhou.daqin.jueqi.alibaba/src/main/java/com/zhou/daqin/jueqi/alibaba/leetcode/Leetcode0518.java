package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0518 {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins)
            for (int i = coin; i <= amount; i++)
                dp[i] += dp[i - coin];
        return dp[amount];
    }

    /**
     * @return number of ways to make sum s using repeated coins
     * 元素可以重复使用
     * 很棒的视频，感谢您的上传。我认为您没有解释的一件事是，为什么外循环是硬币，而不是数量。这背后的原因是，正如您提到的，问题是找到组合的总数，而不是排列。如果外部循环是数量，则同一组合将被计算多次，因为它们的顺序可能不同。通过使硬币成为外部循环，可以确保对于任何有效组合，每个硬币的顺序始终与它们在硬币中的顺序相同，因此不能重复。
     * 参考视频：https://www.youtube.com/watch?v=jaNZ83Q3QGc&list=WL&index=12&t=0s
     */
    public int coinrep(int[] coins, int s) {
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= s; i++) {
                dp[i] += dp[i - coin];
                printArray(dp);
            }
            System.out.println();
        }

        return dp[s];
    }

    /**
     * @return number of ways to make sum s using non-repeated coins
     * 元素不可以重复使用
     */
    public int coinnonrep(int[] coins, int s) {
        int[] dp = new int[s + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = s; i >= coin; i--) {
                dp[i] += dp[i - coin];
                printArray(dp);
            }
            System.out.println();
        }

        return dp[s];
    }

    private void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
