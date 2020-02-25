package com.hzy.demo02;

public class Proxy implements Service {
    ServiceImpl service;

    public void setService(ServiceImpl service) {
        this.service = service;
    }

    public void add() {
        log("add");
        service.add();
    }

    public void delete() {
        log("delete");
        service.delete();
    }

    public void update() {
        log("update");
        service.update();
    }

    public void select() {
        log("select");
        service.select();
    }

    public void log(String msg) {
        System.out.println("this is " + msg);
    }
}
