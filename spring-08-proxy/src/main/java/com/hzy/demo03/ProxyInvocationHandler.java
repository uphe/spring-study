package com.hzy.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//该类会自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler{

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }

    //处理代理程序，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质，用反射机制
        seeHost();//被扩展的功能可以直接加到这
        Object result = method.invoke(rent,args);
        return result;
    }

    //在这里可以扩展功能
    public void seeHost() {
        System.out.println("代理带看房子");
    }
}
