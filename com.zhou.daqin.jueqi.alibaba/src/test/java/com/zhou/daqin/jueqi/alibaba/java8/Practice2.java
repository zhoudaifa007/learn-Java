package com.zhou.daqin.jueqi.alibaba.java8;

import org.junit.Test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Practice2 {

    @Test
    public void test1() {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "Runoob";
        Integer result = null;
        String s = "(function(a){\n" +
                "    return a;\n" +
                "})('a');";
        String result1 = null;
        try {
            Object ob = nashorn.eval("print('" + name + "')");
            result = (Integer) nashorn.eval("10 + 2");
            result1 = (String)nashorn.eval(s);

        }catch(ScriptException e){
            System.out.println("执行脚本错误: "+ e.getMessage());
        }

        System.out.println(result.toString());
        System.out.println(result1);
    }
}
