package com.sxj.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello/{id}")
    @HystrixCommand(fallbackMethod = "fallback")
    public String Hello(@PathVariable("id")int id){
        if(id==1){
            throw new RuntimeException("qaqaqa");
        }
        return "还好id不是1，hello world~";
    }

    public String fallback(@PathVariable("id")int id){
        return id+"   哈哈，你的id是1，熔断";
    }

}
