package com.zhou.daqin.jueqi.alibaba.java8;

import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTests {

    @Test
    public void test1() {
        List<String> strs = Arrays.asList("好,好,学", "习,天,天", "向,上");

        List<String[]> strArray = strs.stream().map(str -> str.split(",")).collect(Collectors.toList());



        // flatMap与map的区别在于 flatMap是将一个流中的每个值都转成一个个流，然后再将这些流扁平化成为一个流 。
        List<String> strList = strArray.stream().flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println("strList => " + strList);

    }
}
