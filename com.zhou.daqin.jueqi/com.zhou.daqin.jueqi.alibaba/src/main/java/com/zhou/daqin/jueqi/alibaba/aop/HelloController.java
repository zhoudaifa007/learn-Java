package com.zhou.daqin.jueqi.alibaba.aop;

import org.springframework.web.bind.annotation.*;

/**
 * Created by ZHOUDF2 on 2016-12-26.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        System.out.println("Controller hello");
        return "Hello " + name;
    }
}