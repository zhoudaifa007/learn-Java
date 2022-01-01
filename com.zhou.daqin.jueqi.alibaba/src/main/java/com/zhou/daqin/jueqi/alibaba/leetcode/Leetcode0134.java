package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode0134 {
    //容易超时
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int gasTotal = Arrays.stream(gas).sum();
        int gasCost = Arrays.stream(cost).sum();
        if(gasTotal < gasCost) {
            return -1;
        }

        GasNode head =  new GasNode();

        head.gasOffer = gas[0];
        head.gasCost = cost[0];
        head.index = 0;

        Map<Integer,GasNode> map = new HashMap<>();
        map.put(0, head);

        GasNode lastNode = head;

        for(int i = 1 ; i < gas.length; i++) {
            GasNode cur = new GasNode();
            cur.gasOffer = gas[i];
            cur.gasCost = cost[i];
            cur.index = i;
            map.put(i, cur);
            lastNode.next = cur;
            lastNode = cur;
            if(i == gas.length - 1) {
                lastNode.next = head;
            }
        }


        int result = -1;

        for(int i = 0; i < gas.length; i++) {
           GasNode node =  map.get(i);
           if(node.gasCost > node.gasOffer) {
               continue;
           }
           GasNode next = node.next;
           int total = node.gasOffer - node.gasCost;
           while (next.index != node.index) {
               total =  total + next.gasOffer - next.gasCost;
               if(total < 0) {
                   break;
               }
               next = next.next;
           }
           if (total >= 0 ) {
               result = node.index;
               break;
           }

        }

        return result;
    }

    static class GasNode {
        int index;

        int gasOffer;

        int gasCost;

        GasNode next;
    }

    //官方解法
    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int n = gas.length;
        int sum = 0;
        for(int i = 0;i < n;i++){
            sum += gas[i] - cost[i];
        }

        if(sum < 0){
            return -1;
        }

        int currentGas = 0;
        int start = 0;
        for(int i = 0;i < n;i++){
            currentGas += gas[i] - cost[i];
            if(currentGas < 0){
                currentGas = 0;
                start = i + 1;
            }
        }
        return start;
    }


}
