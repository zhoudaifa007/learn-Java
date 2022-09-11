package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0005 {
    //https://leetcode.com/problems/longest-palindromic-substring/discuss/1479021/JAVA-Using-Dynamic-Programming
    public String longestPalindrome(String str) {
        int n = str.length();
        boolean dp[][] = new boolean[n][n];
        int li = -1;
        int lj = -1;
        //二位数组的斜形遍历
        for (int d = 0; d < n; d++) {
            for (int i = 0, j = d; j < n; i++, j++) {
                System.out.printf("%d   %d \n", i, j);
                if (d == 0) {
                    //one length substring
                    dp[i][j] = true;
                } else if (d == 1) {
                    //two length substring
                    if (str.charAt(i) == str.charAt(j)) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = false;
                    }
                } else {
                    //more than 2 length substrings
                    dp[i][j] = str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1];
                }

                if (dp[i][j] == true) {
                    li = i;
                    lj = j;
                }
            }
        }

        return str.substring(li, lj + 1);
    }
}
