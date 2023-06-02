package com.example.test.controller;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@MapperScan("com.example.test.mapper")
public class HelloController {
    @RequestMapping("/index")
    public String sayHello() {
        return "index";
    }
}