package com.hzy.demo01;

public class Proxy implements Rent{
    private Host host;

    public void setHost(Host host) {
        this.host = host;
    }

    public void rent() {
        //这里是代理帮助房东出租房子
        host.rent();
        seeHost();
        seeHost();
    }

    public void seeHost() {
        System.out.println("代理带你看房子");
    }

    public void signContract() {
        System.out.println("代理跟你签合同");
    }

}
