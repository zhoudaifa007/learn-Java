package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;

public class CglibDynamicProxyTest {

    @Test
    public void test1()
    {
        UserServiceCglib cglib = new UserServiceCglib();
        UserServiceImpl bookFacadeImpl = (UserServiceImpl)cglib.getInstance(new UserServiceImpl());
        bookFacadeImpl.addUser();
    }
}
