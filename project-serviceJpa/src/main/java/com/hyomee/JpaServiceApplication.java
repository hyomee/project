package com.hyomee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.Arrays;


// @EnableJpaRepositories(basePackages = {  "com.hyomee.work.workService" })
@EnableJpaAuditing
@EnableCaching
@SpringBootApplication()
public class JpaServiceApplication  {
    public static void main(String[] args) {
        SpringApplication.run(JpaServiceApplication.class, args);
    }
}