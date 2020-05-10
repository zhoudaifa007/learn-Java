package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0138 {

    public Node copyRandomList(Node head) {
        Node tmp = head;
        Map<Integer,Node> map = new HashMap<>();
        Map<Node,Integer> map1 = new HashMap<>();
        int i = 0;
        Node dummy = new Node(-1);
        Node curr = dummy;
        while (tmp != null) {
            Node node =  new Node(tmp.val);
            curr.next = node;
            curr = node;
            map.put(i,curr);
            map1.put(tmp, i);
            i++;
            tmp = tmp.next;
        }

        tmp = head;
        i = 0;
        while (tmp != null) {
            Node node1 = map.get(i);
            Node node2 = tmp.random;
            if(node2 != null) {
                int index = map1.get(node2);
                Node node3 = map.get(index);
                node1.random = node3;
            }

            tmp = tmp.next;
            i++;
        }

        return dummy.next;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}

