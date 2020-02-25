package com.hzy.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
/*
* @Autowired注解实现自动装配，不用set方法，set方法是用来给实例赋值的
* 自动装配之后，People类的实例就可以获取Dog类和Cat类的实例，以便调用其方法
* 使用了自动装配就相当于是<property name="dog" ref="dog"/>的bean注入
*
* */
public class People {

    private String name;
    //@Resource
    @Autowired
    private Dog dog;
    //@Resource
    @Autowired
    private Cat cat;

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
