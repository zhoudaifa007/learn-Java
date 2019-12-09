package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

public class Leetcode0061 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) {
            return head;
        }

        int length = getLength(head);
        int index = getIndex(k, length);

        if(index == length) {
            return head;
        }

        int count = 1;
        ListNode leftEndNode = head;
        while (count < index) {
            leftEndNode = leftEndNode.next;
            count = count + 1;
        }


        ListNode rightStartNode = leftEndNode.next;
        leftEndNode.next = null;

        ListNode rightEndNode = rightStartNode;
        while (rightEndNode.next != null) {
            rightEndNode = rightEndNode.next;
        }

        rightEndNode.next = head;

        head = rightStartNode;
        return head;
    }

    private int getLength(ListNode head) {
        ListNode node = head;
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }

    private int getIndex(int k, int length) {
        int index = length - (k % length);
        return index;
    }

}
