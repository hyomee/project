package com.hyomee.service.solution.redis.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.solution.querydsl.casewhen.service.CaseWhenService;
import com.hyomee.service.solution.redis.dto.RedisDTO;
import com.hyomee.service.solution.redis.service.RedisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/redis")
public class RedisTestController {

  private final RedisTestService redisTestService;

  @PutMapping ("/put/{cacheName}")
  public ResponseEntity put( @PathVariable String cacheName,
                             @RequestBody RedisDTO redisDTO)   {
    return ResponseUtils.completed(redisTestService.put(cacheName, redisDTO));
  }

}
