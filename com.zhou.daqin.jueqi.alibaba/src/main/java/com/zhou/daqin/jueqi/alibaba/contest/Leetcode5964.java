package com.zhou.daqin.jueqi.alibaba.contest;

public class Leetcode5964 {

    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] res = new int[s.length()];
        int length = s.length();
        char[] array = s.toCharArray();

        for (int i = 0; i < length; i++) {
            int count = 0;
            int x = startPos[0];
            int y = startPos[1];
            for (int j = i; j < length; j++) {
                char c = array[j];
                if (c == 'R') {
                    y = y + 1;
                }
                if (c == 'L') {
                    y = y - 1;
                }
                if (c == 'U') {
                    x = x - 1;
                }
                if (c == 'D') {
                    x = x + 1;
                }

                if (x < n && x >= 0 && y < n && y >= 0) {
                    count = count + 1;
                } else {
                    break;
                }
            }
            res[i] = count;
        }

        return res;
    }
}
