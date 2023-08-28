package com.hyomee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling   // 스케줄링 기능활성화
@SpringBootApplication
public class SchedulerServiceApplication {
  public static void main(String[] args) {
    SpringApplication.run(SchedulerServiceApplication.class, args);
  }
}