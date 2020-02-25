package com.hzy.diy;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect //标注这是一个切面
public class AnnotationPointCut {

    @Before("execution(* com.hzy.service.UserServiceImpl.*(..))")
    public void beforeLog() {
        System.out.println("---方法执行前---");
    }

    @After("execution(* com.hzy.service.UserServiceImpl.*(..))")
    public void afterLob() {
        System.out.println("---方法执行后---");
    }
}
