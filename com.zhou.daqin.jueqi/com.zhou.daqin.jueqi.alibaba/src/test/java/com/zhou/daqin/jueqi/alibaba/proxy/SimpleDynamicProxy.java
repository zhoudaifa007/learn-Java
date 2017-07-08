package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Proxy;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
@RunWith(SpringRunner.class)
public class SimpleDynamicProxy {

    @Test
    public void test1()
    {
        RealSubject real = new RealSubject();
        consumer(real);
        //参数1：类加载器，通常可以重已经被加载的对象中获取其类加载器
        //参数2：代理类的接口列表（不是类或抽象）,因为一个类可以实现多个接口
        //参数3：调用处理器，通常会在通用处理器的构造器传递一个“实际”对象的引用
        Interface proxy = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),new Class[] {Interface.class},new DynamicProxyHandler(real));
        consumer(proxy);
    }

    private static void consumer(Interface iface)
    {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }
}
