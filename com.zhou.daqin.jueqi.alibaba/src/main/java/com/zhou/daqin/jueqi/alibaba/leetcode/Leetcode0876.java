package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.zhou.daqin.jueqi.alibaba.common.ListNode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode0876 {
    public ListNode middleNode(ListNode head) {
        Map<Integer, ListNode> map = new HashMap<>();
        ListNode node = head;
        int index = 0;
        while (node != null) {
            map.put(index, node);
            index = index +1;
            node = node.next;
        }
        int size = map.size();
        int i = size / 2;
        return map.get(i);
    }
}
