package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;
import org.junit.Test;

public class Leetcode061Tests {

    @Test
    public void test1() {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = null;
        Leetcode061 leetcode061 = new Leetcode061();
        ListNode list =  leetcode061.rotateRight(a1, 2);
        System.out.println(list);

    }
}
