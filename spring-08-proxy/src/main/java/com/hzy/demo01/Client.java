package com.hzy.demo01;
/*
* 该案例里的4个demo讲解的是代理模式，为后面的AOP做准备
* */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        Proxy proxy = new Proxy();
        proxy.setHost(host);
        proxy.rent();
    }
}
