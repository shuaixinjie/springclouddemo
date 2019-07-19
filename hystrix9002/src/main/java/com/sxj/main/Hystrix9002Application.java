package com.sxj.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.sxj.feign")
@ComponentScan("com.sxj.controller")
@ComponentScan("com.sxj.lower")
public class Hystrix9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix9002Application.class,args);
    }
}
