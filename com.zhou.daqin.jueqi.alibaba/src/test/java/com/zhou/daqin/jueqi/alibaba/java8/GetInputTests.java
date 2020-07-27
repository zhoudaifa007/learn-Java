package com.zhou.daqin.jueqi.alibaba.java8;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GetInputTests {


    public static void main(String[] args) throws Exception {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        List<String> paramList = new ArrayList<>();
        String str = null;
        while ((str = buf.readLine()) != null) {
            paramList.add(str.trim());
        }
        buf.close();

        System.out.println(JSONObject.toJSONString(paramList));
    }
}
