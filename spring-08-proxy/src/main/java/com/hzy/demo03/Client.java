package com.hzy.demo03;

import com.sun.org.apache.regexp.internal.RE;

public class Client {
    public static void main(String[] args) {

        //这是真实角色，也就是我们的房东
        Host host = new Host();

        //创建代理调用处理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //通过调用程序处理角色来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);

        //创建代理对象
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();
        proxy.rent();

    }
}
