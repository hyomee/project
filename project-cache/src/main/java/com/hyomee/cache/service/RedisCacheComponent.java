package com.hyomee.cache.service;


import lombok.RequiredArgsConstructor;
import org.springframework.cache.Cache;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class RedisCacheComponent<T> {

  private final CacheManager cacheManager;

  public T get(String cacheName, String key){
    return (T) getCacheName(cacheName).get(key);
  }

  public T get(String cacheName, String key, Class<T> clszz) {
    return  getCacheName(cacheName).get(key, clszz);
  }

  public void put(String cacheName, String key, Object value){
    getCacheName(cacheName).put(key, value);
  }

  public void putIfAbsent(String cacheName, String key, Object value){
    getCacheName(cacheName).put(key, value);
  }

  public void removeValues(String cacheName, String key){
    getCacheName(cacheName).evictIfPresent(key);
  }

  public void clear(String cacheName){
    getCacheName(cacheName).invalidate();
  }
  private Cache getCacheName(String cacheName) {
    return cacheManager.getCache(cacheName);
  }


}
