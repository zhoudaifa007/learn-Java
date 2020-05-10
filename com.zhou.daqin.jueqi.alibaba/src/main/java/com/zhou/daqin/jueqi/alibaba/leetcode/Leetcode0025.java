package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

public class Leetcode0025 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev != null) {
            prev = reverse(prev, k);
        }

        return dummy.next;
    }

    //D-->1-->2-->3-->4-->5-->null， k = 3
    private ListNode reverse(ListNode prev, int k) {
        ListNode last = prev;

        //last=4
        for (int i = 0; i < k + 1; i++) {
            last = last.next;
            //不够k个元素
            if (i != k && last == null) {
                return null;
            }
        }

        //指向1
        ListNode tail = prev.next;
        //指向2
        ListNode curr = prev.next.next;
        while (curr != last) {
            ListNode next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            tail.next = next;
            curr = next;
        }

        return tail;
    }
}
