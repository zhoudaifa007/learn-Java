package com.zhou.daqin.jueqi.alibaba.leetcode;

import org.junit.Test;

public class Leetcode2342Tests {

    @Test
    public void test1() {
        Leetcode2342 leetcode2342 = new Leetcode2342();
        int[] nums = {229,398,269,317,420,464,491,218,439,153,482,169,411,93,147,50,347,210,251,366,401};
        int max = leetcode2342.maximumSum(nums);
        System.out.println(max);
    }
}
