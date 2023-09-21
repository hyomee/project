package com.hyomee.service.solution.redis.doc;

import com.hyomee.service.solution.redis.dto.RedisDTO;

import lombok.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
@Data
@RedisHash(value = "REDIS_HASH_DOC" , timeToLive = 30)
public class RedisHashDOC {

    @Id
    private String custChnlCd;

    @Indexed
    private String custChnlNm;

    private List<RedisDTO> redisDTOList;

}
