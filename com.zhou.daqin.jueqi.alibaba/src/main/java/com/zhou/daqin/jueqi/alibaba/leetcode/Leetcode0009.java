package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0009 {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x> rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }

    public boolean isPalindrome1(int x) {
        if(x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


}
