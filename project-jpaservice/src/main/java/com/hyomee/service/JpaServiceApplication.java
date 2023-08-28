package com.hyomee.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


// @EnableJpaRepositories(basePackages = {  "com.hyomee.work.workService" })
@SpringBootApplication
public class JpaServiceApplication  {
    public static void main(String[] args) {
        SpringApplication.run(JpaServiceApplication.class, args);
    }
}