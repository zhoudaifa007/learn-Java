package com.zhou.daqin.jueqi.alibaba.leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Leetcode1268 {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        TreeSet<String> set = new TreeSet<>();

        for(int i = 0; i < products.length; i++) {
            set.add(products[i]);
        }

        List<List<String>> res = new ArrayList<>();
        for(int k = 0;  k < searchWord.length(); k++) {
            String s = searchWord.substring(0, k + 1);
            List<String> list = new ArrayList<>();
            Iterator<String> iterator = set.iterator();
            while (iterator.hasNext()) {
                String word = iterator.next();
                if(word.indexOf(s) != 0) {
                    iterator.remove();
                } else {
                    if(list.size() < 3) {
                        list.add(word);
                    }
                }
            }

            res.add(list);

        }

        return res;
    }
}
