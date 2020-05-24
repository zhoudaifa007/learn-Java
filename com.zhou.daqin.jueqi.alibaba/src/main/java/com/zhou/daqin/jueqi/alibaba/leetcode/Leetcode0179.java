package com.zhou.daqin.jueqi.alibaba.leetcode;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Daifa on 2018/4/7.
 */
public class Leetcode0179 {

    public static String largestNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return "";
        }

        int length = nums.length;
        String[] strArray = new String[length];
        for(int index = 0; index < length; index++) {
            strArray[index] = String.valueOf(nums[index]);
        }

        System.out.println(JSON.toJSONString(strArray));
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String str1 = s1 + s2;
                String str2 = s2 + s1;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(strArray, comparator);
        System.out.println(JSON.toJSONString(strArray));

        if(strArray[0].charAt(0) == '0')
            return "0";

        StringBuilder sb = new StringBuilder();

        for(String str:strArray) {
            sb.append(str);
        }

        return sb.toString();
    }
}
