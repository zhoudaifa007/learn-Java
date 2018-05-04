package com.zhou.daqin.jueqi.alibaba.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Daifa on 2018/4/5.
 */
public class TwoSumNotOrdered {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
