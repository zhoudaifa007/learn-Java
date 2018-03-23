package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;
/**
 * Created by zhoudf2 on 2017-7-8.
 */

public class StaticProxyTest {

    @Test
    public void test1()
    {
        UserServiceImpl userImpl = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy(userImpl);
        proxy.addUser();
        System.out.println("------分割线--------");
        proxy.editUser();
    }
}
