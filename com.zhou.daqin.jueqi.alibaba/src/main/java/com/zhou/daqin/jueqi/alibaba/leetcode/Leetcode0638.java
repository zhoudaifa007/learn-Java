package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.List;

public class Leetcode0638 {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(price, special, needs);
    }

    public int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int sum = 0, len = price.size();
        for (int i = 0; i < len; i++) sum += needs.get(i)*price.get(i);
        for (List<Integer> list : special) {
            if (qualify(list, needs)){
                for (int i = 0; i < len; i++) needs.set(i,needs.get(i)-list.get(i));
                int temp = helper(price, special, needs);
                sum = Math.min(sum,temp + list.get(len));
                for (int i = 0; i < len; i++) needs.set(i,needs.get(i)+list.get(i));
            }
        }
        return sum;
    }

    public boolean qualify(List<Integer> list, List<Integer> needs) {
        int len = needs.size();
        for (int i = 0; i < len; i++)
            if (list.get(i) > needs.get(i)) return false;
        return true;
    }
}
