package com.hzy.controller;

import com.hzy.annotation.MyLog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: hzy
 * @Date: 2020/12/29
 */
@RestController
public class MyController {

    @MyLog
    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
