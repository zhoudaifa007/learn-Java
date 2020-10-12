package com.zhou.daqin.jueqi.alibaba.nowcoder;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

public class FlipArrayTests {

    @Test
    public void test1() {
       int[][] A =  {{0,1,0,0},{1,0,1,0},{1,1,0,0},{1,0,0,1}};
        int[][] f = {{2,3},{4,2},{2,3}};
        FlipArray flipArray = new FlipArray();
        int[][] B = flipArray.flipChess(A, f);
        System.out.println(JSONObject.toJSONString(B));
    }
}
