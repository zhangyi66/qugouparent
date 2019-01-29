package com.yixun.qugou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlatApplication8001 {
    public static void main(String[] args) {
        SpringApplication.run(PlatApplication8001.class,args);
    }
}
