package com.sxj.controller;

import com.sxj.feign.HelloFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private HelloFeign helloFeign;

    @GetMapping("/index")
    public String index(){
        return helloFeign.index();
    }
}
