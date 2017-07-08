package com.zhou.daqin.jueqi.alibaba.proxy;

/**
 * Created by zhoudf2 on 2017-7-8.
 */
public class UserServiceProxy implements UserService {

    private UserServiceImpl userImpl;

    public UserServiceProxy(UserServiceImpl countImpl) {
        this.userImpl = countImpl;
    }

    public void addUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.addUser();
        System.out.println("处理结束。。。");
    }

    //缺点：代码重复率太高
    public void editUser() {
        System.out.println("代理类方法，进行了增强。。。");
        System.out.println("事务开始。。。");
        // 调用委托类的方法;
        userImpl.editUser();
        System.out.println("事务结束。。。");
    }

}
