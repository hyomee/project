package com.hyomee.service.solution.redis.repository;

import com.hyomee.service.solution.redis.doc.RedisHashDOC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedisHashRepository extends JpaRepository<RedisHashDOC, String> {
    List<RedisHashDOC> findByCustChnlNm(String custChnlNm);
}
