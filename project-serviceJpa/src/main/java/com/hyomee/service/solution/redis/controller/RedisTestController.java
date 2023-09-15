package com.hyomee.service.solution.redis.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.solution.querydsl.casewhen.service.CaseWhenService;
import com.hyomee.service.solution.redis.doc.RedisHashDOC;
import com.hyomee.service.solution.redis.dto.RedisDTO;
import com.hyomee.service.solution.redis.service.RedisHashService;
import com.hyomee.service.solution.redis.service.RedisTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/redis")
public class RedisTestController {

  private final RedisTestService redisTestService;
  private final RedisHashService redisHashService;
  @PutMapping ("/put/{cacheName}")
  public ResponseEntity put( @PathVariable String cacheName,
                             @RequestBody RedisDTO redisDTO)   {
    return ResponseUtils.completed(redisTestService.put(cacheName, redisDTO));
  }


  @PutMapping ("/hash")
  public ResponseEntity saveHash(  @RequestBody RedisHashDOC redisHashDOC)   {
    return ResponseUtils.completed(redisHashService.saveRedisHashDoc(redisHashDOC));
  }

  @GetMapping ("/hash/{custChnlCd}")
  public ResponseEntity getHash(  @PathVariable String custChnlCd )   {
    return ResponseUtils.completed(redisHashService.getRedisHashDoc(custChnlCd));
  }

  @DeleteMapping("/hash")
  public ResponseEntity deleteAll()   {
    redisHashService.deleteAll();
    return ResponseUtils.completed("OK");
  }

  @GetMapping ("/hash/custChnlNm/{custChnlNm}")
  public ResponseEntity findByCustChnlNm(String custChnlNm) {
    return ResponseUtils.completed(redisHashService.findByCustChnlNm(custChnlNm)) ;
  }
}
