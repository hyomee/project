package com.hyomee.service.solution.redis.service;

import com.hyomee.service.solution.redis.doc.RedisHashDOC;
import com.hyomee.service.solution.redis.repository.RedisHashRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RedisHashService {

    private final RedisHashRepository redisHashRepository;

    public RedisHashDOC getRedisHashDoc(String custChnlCd) {
        RedisHashDOC redisHashDOC = new RedisHashDOC();
        Optional<RedisHashDOC> redisHashDOCOptional = redisHashRepository.findById(custChnlCd);
        if (redisHashDOCOptional.isPresent()) {
            return redisHashDOCOptional.get();
        }
        return redisHashDOC ;

    }

    public List<RedisHashDOC> findByCustChnlNm(String custChnlNm) {
        return redisHashRepository.findByCustChnlNm(custChnlNm);
    }

    public RedisHashDOC saveRedisHashDoc(RedisHashDOC redisHashDOC) {
            return redisHashRepository.save(redisHashDOC) ;
    }

    public void deleteAll() {
        redisHashRepository.deleteAll();
    }
}
