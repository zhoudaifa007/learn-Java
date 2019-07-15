package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by Daifa on 2018/4/14.
 */
public class LongIncreSubString {

    public static int LongestSubString(int arr[], int[] dp) {
        int len = 0;
        if (arr == null || arr.length == 0)
            return 0;
        dp[0] = 1;
        //dp[i] 表示到i为止是最长递增子序列的长度
        for (int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    //求dp[i]时遍历，dp[0...i-1],找出arr[j]<arr[i]小且dp[j]是最大的
                    //dp[i]=dp[j]+1;
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            len = Math.max(dp[i], len);
        }
        return len;
    }

    //最优值，求出dp[i]之后要求出递增子序列[10,22,33,41,60,80]
    //先找到最大dp[i]，从后往前，如果dp[i]==dp[j]+1,且arr[i]>arr[j]，则可知arr[j]是子序列中
    //arr[i]前面的数.

    public static void generateLIS(int arr[], int dp[]) {
        int k = 0;
        int index = 0;
        int len = 0;
        for (int i = 0; i < arr.length; i++) {
            if (dp[i] > len) {
                len = dp[i];
                index = i;
                //找到递增子序列中的最后一个元素[10,22,33,41,60,80]中的80，
            }
        }
        int subArr[] = new int[len];
        subArr[k++] = arr[index];
        for (int j = index - 1; j >= 0; j--) {
            if ((dp[index] == dp[j] + 1) && (arr[index] > arr[j])) {
                //从后向前,将属于递增子序列的元素加入到subArr中。
                subArr[k++] = arr[j];
                index = j;
            }
        }
        for (int j = subArr.length - 1; j >= 0; j--) {
            System.out.print(subArr[j] + " ");
        }
    }
}
