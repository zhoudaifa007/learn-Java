package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0038 {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        char[] charArray = countAndSay(n - 1).toCharArray();

        int start = 0;
        int end = 0;

        StringBuilder sb = new StringBuilder();

        while (end < charArray.length) {
            if (charArray[start] != charArray[end]) {
                sb.append(end -start).append(charArray[start]);
                start = end;
            }
            end = end + 1;
        }
        sb.append(end -start).append(charArray[start]);;

        return sb.toString();
    }

}
