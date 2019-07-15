package com.zhou.daqin.jueqi.alibaba.leetcode;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Daifa on 2018/4/7.
 */
public class LargestNumber {

    public static String getMax(int[] array) {
        if(array == null || array.length == 0) {
            return "";
        }

        int length = array.length;
        String[] strArray = new String[length];
        for(int index = 0; index < length; index++) {
            strArray[index] = String.valueOf(array[index]);
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(s1);
            }
        };
        Arrays.sort(strArray, comparator);

        if(strArray[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();

        for(String str:strArray) {
            sb.append(str);
        }

        return sb.toString();
    }
}
