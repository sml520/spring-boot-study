package com.sxb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张元亮
 * @date 2020/4/3
 */
@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String hello(String name) {

        return "hello world, " + name;
    }
}
