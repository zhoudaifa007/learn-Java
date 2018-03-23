package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by zhoudf2 on 2017-7-9.
 */

import java.util.*;

/**
 *
 * 349. Intersection of Two Arrays
 */
public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] arr = new int[0];
        int index1 = 0;
        int index2 = 0;
        Set<Integer> set = new HashSet<Integer>();

        while(index1 < nums1.length && index2 < nums2.length)
        {
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            if(num1 > num2)
            {
                index2 = index2 + 1;
            }
            else if(num1 < num2)
            {
                index1 = index1 + 1;
            } else
            {
                set.add(nums1[index1]);
                index1 = index1 + 1;
                index2 = index2 + 1;
            }
        }

        index1 = 0;
        index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length)
        {
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            if(num1 < num2)
            {
                index2 = index2 + 1;
            }
            else if(num1 > num2)
            {
                index1 = index1 + 1;
            } else
            {
                set.add(nums1[index1]);
                index1 = index1 + 1;
                index2 = index2 + 1;
            }
        }

        if(set.size() > 0)
        {
            arr = new int[set.size()];
            int i = 0;
            for(Integer ele: set)
            {
                arr[i] = ele;
                i++;
            }
        }
        return  arr;
    }
}
