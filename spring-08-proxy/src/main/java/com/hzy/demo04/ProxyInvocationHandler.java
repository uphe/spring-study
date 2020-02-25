package com.hzy.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    Service service;

    public void setService(Service service) {
        this.service = service;
    }

    //生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),service.getClass().getInterfaces(),this);
    }

    //处理代理类，返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());//调用扩展业务
        Object result = method.invoke(service,args);
        return result;
    }

    //增加的扩展业务
    public void log(String msg) {
        System.out.println("this is " + msg);
    }
}
