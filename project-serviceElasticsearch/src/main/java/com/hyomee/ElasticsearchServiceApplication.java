package com.hyomee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

// @EnableScheduling
// @EnableJpaRepositories(basePackages = { "com.hyomee.core.jpa", "com.hyomee.demo.jpa", "com.hyomee.work.workService" })
// @EnableElasticsearchRepositories(basePackages = { "com.hyomee.demo.es", "com.hyomee.work.workEcService" })
@SpringBootApplication

public class ElasticsearchServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ElasticsearchServiceApplication.class, args);
  }
}