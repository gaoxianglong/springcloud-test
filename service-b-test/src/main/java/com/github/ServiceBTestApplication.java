package com.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ServiceBTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceBTestApplication.class, args);
    }

}
