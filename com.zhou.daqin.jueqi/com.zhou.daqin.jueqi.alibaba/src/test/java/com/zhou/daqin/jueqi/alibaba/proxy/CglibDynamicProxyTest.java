package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
@RunWith(SpringRunner.class)
public class CglibDynamicProxyTest {

    @Test
    public void test1()
    {
        UserServiceCglib cglib = new UserServiceCglib();
        UserServiceImpl bookFacadeImpl = (UserServiceImpl)cglib.getInstance(new UserServiceImpl());
        bookFacadeImpl.addUser();
    }
}
