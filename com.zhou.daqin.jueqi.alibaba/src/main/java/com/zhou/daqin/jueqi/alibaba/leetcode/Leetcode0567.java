package com.zhou.daqin.jueqi.alibaba.leetcode;

public class Leetcode0567 {



    public boolean checkInclusion(String s1, String s2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        init(s1,c1);
        int  i = 0;
        int j = 0;

        while ( i < s2.length()) {
            c2[s2.charAt(i) - 'a']++;
            if(i - j + 1 == s1.length()) {
               boolean flag =  isSame(c1,c2);
               if(flag) {
                   return true;
               } else {
                   c2[s2.charAt(j) - 'a']--;
                   j++;
               }
            }
            i++;
        }

        return false;
    }

    private void init(String s1,int[] c1) {
        if(s1 == null) {
            return;
        }
        for(int i = 0; i < s1.length(); i++) {
            c1[s1.charAt(i) - 'a']++;
        }
    }

    private boolean isSame(int[] c1, int[] c2) {
        for(int k = 0; k < 26; k++) {
            if(c1[k] != c2[k]) {
                return false;
            }
        }
        return true;
    }
}
