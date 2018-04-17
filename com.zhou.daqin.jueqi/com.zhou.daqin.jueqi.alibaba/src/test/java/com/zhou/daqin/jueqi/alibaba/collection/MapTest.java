package com.zhou.daqin.jueqi.alibaba.collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by zhoudf2 on 2018-3-30.
 */
public class MapTest {

    @Test
    public void test1() {
        MapReq  req = new MapReq();
        req.setName("xiaoshaoyong");
        List<MapReq> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<String,Object>();
        if(!CollectionUtils.isEmpty(list)) {
            map = list.stream().collect(
                    Collectors.toMap(MapReq::getName, MapReq::getValue));
        }
        System.out.println(JSONObject.toJSONString(map));

    }

     class MapReq {

        private String name;

        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

}
