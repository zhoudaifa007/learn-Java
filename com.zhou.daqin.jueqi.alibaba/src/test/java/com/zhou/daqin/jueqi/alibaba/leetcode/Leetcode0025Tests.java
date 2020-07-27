package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;
import org.junit.Test;

public class Leetcode0025Tests {

    @Test
    public void test1() {
        Leetcode0025 leetcode0025 = new Leetcode0025();
        int[] nums = {1, 2, 3, 4, 5};
        ListNode listNode = leetcode0025.buildList(nums);
        leetcode0025.reverseKGroup(listNode, 3);
    }
}
