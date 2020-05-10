package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

import java.util.Stack;

public class Leetcode0445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack = new Stack<>();

        ListNode tmp = l1;

        while (tmp != null) {
            stack1.push(tmp.val);
            tmp = tmp.next;
        }

        tmp = l2;

        while (tmp != null) {
            stack2.push(tmp.val);
            tmp = tmp.next;
        }

        int left = 0;
        while (!stack1.empty() || !stack2.empty()  || left !=0) {
            int sum = left;

            if(!stack1.empty()) {
                sum = sum + stack1.pop();
            }

            if(!stack2.empty()) {
                sum = sum + stack2.pop();
            }

            if(sum >= 10) {
                sum = sum - 10;
                left = 1;
            } else {
                left = 0;
            }
            stack.push(sum);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (!stack.empty()) {
            ListNode node = new ListNode(stack.pop());
            curr.next = node;
            curr = curr.next;
        }

        return dummy.next;
    }
}
