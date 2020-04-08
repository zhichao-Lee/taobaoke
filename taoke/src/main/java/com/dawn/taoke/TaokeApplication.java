package com.dawn.taoke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TaokeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaokeApplication.class, args);
    }

}
