package com.sxj.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringCloud {
    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return "Hello,I'm spring cloud,我的端口号是： "+this.port;
    }
}
