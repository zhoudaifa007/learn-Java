package com.zhou.daqin.jueqi.alibaba.nowcoder;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTests {

    @Test
    public void test1() {
        int[] nums = {1,2,3,4};
        System.out.println(binarySearch(nums,5));
    }

    @Test
    public void test2() {
        int[] nums = {3,1, 2, 2, 1, 1};
        System.out.println(JSONObject.toJSONString(calc(nums)));
    }

    public List<Integer> calc(int[] last) {
        List<Integer> cur = new ArrayList();

        int newNum = last[0];
        int count = 1;
        for(int i = 1; i < last.length; i++) {
            if(last[i - 1] == last[i] ) {
                count = count + 1;
            } else {
                cur.add(count);
                cur.add(newNum);
                count = 1;
                newNum = last[i];
            }
        }

        cur.add(count);
        cur.add(newNum);
        return cur;
    }

    private static int binarySearch(int[] nums, int key) {
        if(nums == null) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid =  (high + low ) / 2;
            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
