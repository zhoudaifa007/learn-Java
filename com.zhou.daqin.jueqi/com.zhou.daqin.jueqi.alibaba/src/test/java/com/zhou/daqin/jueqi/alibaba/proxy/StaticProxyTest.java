package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
@RunWith(SpringRunner.class)
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
