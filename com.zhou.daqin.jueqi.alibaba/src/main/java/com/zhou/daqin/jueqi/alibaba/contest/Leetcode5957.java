package com.zhou.daqin.jueqi.alibaba.contest;

public class Leetcode5957 {
    public String addSpaces(String s, int[] spaces) {
        if(spaces == null || spaces.length == 0) {
            return s;
        }

        char[] array = s.toCharArray();
        int spaceIndex = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if(spaceIndex < spaces.length && i == spaces[spaceIndex]) {
                sb.append(" ");
                spaceIndex = spaceIndex + 1;
            }
            sb.append(array[i]);

        }
        return sb.toString();
    }
}
