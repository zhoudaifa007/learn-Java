package com.zhou.daqin.jueqi.alibaba.leetcode;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.List;

public class Leetcode1268Tests {

    @Test
    public void test1() {
        Leetcode1268 leetcode1268 = new Leetcode1268();
        List<List<String>> suggestedProducts = leetcode1268.suggestedProducts(new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"}, "mouse");

        System.out.println(JSON.toJSON(suggestedProducts));

    }
}
