package com.hyomee.service.solution.redis.service;

import com.hyomee.cache.service.RedisCacheComponent;
import com.hyomee.service.solution.redis.dto.RedisDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class RedisTestService {

  private final RedisCacheComponent redisCacheComponent;

  public RedisDTO put(String cacheName, RedisDTO redisDTO) {
    redisCacheComponent.put(cacheName, redisDTO.getProdCd(), redisDTO);

    return (RedisDTO) redisCacheComponent.get(cacheName, redisDTO.getProdCd(), RedisDTO.class  );
  }
}
