package com.hzy.demo02;

public class Client {
    public static void main(String[] args) {
        ServiceImpl service = new ServiceImpl();
        Proxy proxy = new Proxy();
        proxy.setService(service);

        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.select();
    }
}
