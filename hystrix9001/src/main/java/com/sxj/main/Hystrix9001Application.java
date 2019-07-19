package com.sxj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCircuitBreaker
@ComponentScan("com.sxj.controller")
public class Hystrix9001Application {
    public static void main(String[] args) {
        SpringApplication.run(Hystrix9001Application.class,args);
    }
}
