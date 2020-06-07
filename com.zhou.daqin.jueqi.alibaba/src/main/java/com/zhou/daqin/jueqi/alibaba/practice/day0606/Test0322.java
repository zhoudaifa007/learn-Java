package com.zhou.daqin.jueqi.alibaba.practice.day0606;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test0322 {

    private int minCount = Integer.MAX_VALUE;

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] newCoins = new int[coins.length];
        for (int i = 0; i < coins.length; i++) {
            newCoins[coins.length - i - 1] = coins[i];
        }
        helper(newCoins, new ArrayList<>(),  amount, 0);
        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }

    private void helper(int[] newCoins, List<Integer> cur, int target, int start) {
        if( minCount > cur.size())  {
            if (target == 0) {
                minCount = Math.min(minCount,cur.size());
            }
            if (target > 0 ) {
                for (int i = start; i < newCoins.length; i++) {
                    if(target >= newCoins[i]) {
                        cur.add(newCoins[i]);
                        helper(newCoins, cur, target - newCoins[i], i);
                        cur.remove(cur.size() - 1);
                    }
                }
            }
        }
    }
}
