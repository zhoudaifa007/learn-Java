package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Leetcode0324 {

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);

        List<Integer> list = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());


        int index = 0;
        while (list.size() >= 2) {

            int length = list.size();

            int left = 0;
            if (length % 2 == 0) {
                left = length / 2 - 1;
            } else {
                left = length / 2;
            }
            while (list.get(left).equals(list.get(left + 1))) {
                left = left + 1;
            }
            nums[index++] = list.get(left);
            nums[index++] = list.get(left + 1);
            list.remove(left);
            list.remove(left);
        }

        if(list != null && list.size() == 1) {
            nums[index++] = list.get(0);
        }
    }
}
