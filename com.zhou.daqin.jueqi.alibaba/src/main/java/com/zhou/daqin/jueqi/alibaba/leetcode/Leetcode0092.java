package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

public class Leetcode0092 {

    public ListNode reverseBetween(ListNode head, int m, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode last = dummy;

        for(int i = 0; i < m - 1; i++) {
            prev = prev.next;
        }

        for(int i = 0; i < n + 1; i++) {
            last = last.next;
        }

        ListNode tail = prev.next;
        ListNode curr = prev.next.next;

        while (curr != last) {
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            tail.next = next;
            curr = next;
        }

        return dummy.next;
    }
}
