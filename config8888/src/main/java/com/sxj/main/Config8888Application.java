package com.sxj.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Config8888Application {
    public static void main(String[] args) {
        SpringApplication.run(Config8888Application.class,args);
    }
}
