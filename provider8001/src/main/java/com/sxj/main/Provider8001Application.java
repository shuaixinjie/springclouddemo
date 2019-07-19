package com.sxj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sxj.controller")
public class Provider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001Application.class,args);
    }
}
