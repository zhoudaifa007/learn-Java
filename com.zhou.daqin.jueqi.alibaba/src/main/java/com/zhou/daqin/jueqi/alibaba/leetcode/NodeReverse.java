package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by zhoudf2 on 2018-5-5.
 */
public class NodeReverse {

    class InnerNode {
        char value;
        InnerNode next;
    }

    public InnerNode reverse(InnerNode current) {
        //initialization
        InnerNode previousNode = null;
        InnerNode nextNode = null;

        while (current != null) {
            //save the next node
            nextNode = current.next;
            //update the value of "next"
            current.next = previousNode;
            //shift the pointers
            previousNode = current;
            current = nextNode;
        }
        return previousNode;
    }

    public InnerNode reverseRecur(InnerNode current) {
        if (current == null || current.next == null) return current;
        InnerNode nextNode = current.next;
        current.next = null;
        InnerNode reverseRest = reverseRecur(nextNode);
        nextNode.next = current;
        return reverseRest;
    }
}
