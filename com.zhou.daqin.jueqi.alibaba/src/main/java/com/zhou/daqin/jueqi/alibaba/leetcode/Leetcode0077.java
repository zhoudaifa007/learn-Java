package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Leetcode0077 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        subHelper(n,1, res,new ArrayList<>(),k);
        return res;
    }

    private void subHelper(int n, int begin, List<List<Integer>> res, List<Integer> cur, int k) {
        if(cur.size() == k) {
            res.add(new ArrayList<>(cur));
        }

        for(int i = begin; i <= n; i++) {
            cur.add(i);
            subHelper(n, i + 1, res, cur, k);
            cur.remove(cur.size() - 1);
        }
    }
}
