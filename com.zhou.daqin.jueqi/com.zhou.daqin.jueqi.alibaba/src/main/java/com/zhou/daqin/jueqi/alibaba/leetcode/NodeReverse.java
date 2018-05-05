package com.zhou.daqin.jueqi.alibaba.leetcode;

/**
 * Created by zhoudf2 on 2018-5-5.
 */
public class NodeReverse {

    class Node {
        char value;
        Node next;
    }

    public Node reverse(Node current) {
        //initialization
        Node previousNode = null;
        Node nextNode = null;

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

    public Node reverseRecur(Node current) {
        if (current == null || current.next == null) return current;
        Node nextNode = current.next;
        current.next = null;
        Node reverseRest = reverseRecur(nextNode);
        nextNode.next = current;
        return reverseRest;
    }
}
