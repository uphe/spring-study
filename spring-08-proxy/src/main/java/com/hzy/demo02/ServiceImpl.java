package com.hzy.demo02;

import javax.xml.bind.SchemaOutputResolver;

public class ServiceImpl implements Service {
    public void add() {
        System.out.println("add");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void update() {
        System.out.println("update");
    }

    public void select() {
        System.out.println("select");
    }
}
