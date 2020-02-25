package com.hzy.demo04;

public class Client {
    public static void main(String[] args) {
        //创建真实角色，也就是我们的业务
        ServiceImpl service = new ServiceImpl();

        //创建代理调用处理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();

        //设置要代理的对象
        proxyInvocationHandler.setService(service);

        //动态生成代理类
        Service proxy = (Service) proxyInvocationHandler.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();
    }
}
