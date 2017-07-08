package com.zhou.daqin.jueqi.alibaba.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
@RunWith(SpringRunner.class)
public class JdkDynamicProxyTest {

    @Test
    public void test1()
    {
        UserService userService = new JdkUserServiceImpl();
        ServiceInvocationHandler handler = new ServiceInvocationHandler(userService);
        // 根据目标生成代理对象
        UserService proxy = null;
        try {
            proxy = (UserService) handler.getProxy();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        proxy.addUser();
    }
}
