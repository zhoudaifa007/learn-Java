package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0638 {

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return shopping(price, special, needs);
    }

    //设当前搜索到的状态为 shopping(price, special, needs)，其中 price 和 special 为题目中所述的物品的单价和捆绑销售的大礼包，
    // 而 needs 为当前需要的每种物品的数量
    public int shopping(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int  res = dot(needs, price);
        //两层循环，外层是礼包列表，里层是物品列表
        for (List<Integer> s : special) {
            //通过clone回溯
            List<Integer> clone = new ArrayList<>(needs);
            int j = 0;
            for (j = 0; j < needs.size(); j++) {
                int diff = clone.get(j) - s.get(j);
                if (diff < 0)
                    break;
                //设置剩余需要的物品数量
                clone.set(j, diff);
            }
            //说明这个礼包满足物品要求
            if (j == needs.size()) {
                res = Math.min(res, s.get(j) + shopping(price, special, clone));
                //res = Math.min(res, s.get(s.size() - 1) + shopping(price, special, clone));
            }
        }
        return res;
    }

    public int dot(List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            sum += a.get(i) * b.get(i);
        }
        return sum;
    }


}
