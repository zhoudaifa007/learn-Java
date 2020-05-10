package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode0002 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        ListNode tmp = l1;

        while (tmp != null) {
            queue1.offer(tmp.val);
            tmp = tmp.next;
        }

        tmp = l2;

        while (tmp != null) {
            queue2.offer(tmp.val);
            tmp = tmp.next;
        }

        int left = 0;
        while (!queue1.isEmpty() || !queue2.isEmpty()  || left !=0) {
            int sum = left;

            if(!queue1.isEmpty()) {
                sum = sum + queue1.poll();
            }

            if(!queue2.isEmpty()) {
                sum = sum + queue2.poll();
            }

            if(sum >= 10) {
                sum = sum - 10;
                left = 1;
            } else {
                left = 0;
            }
            queue.offer(sum);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!queue.isEmpty()) {
            ListNode node = new ListNode(queue.poll());
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }
}
