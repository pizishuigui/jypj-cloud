package com.piziwang.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JypjAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(JypjAuthApplication.class, args);
    }
}