package com.hyomee.es.vo;

import lombok.Builder;
import lombok.Data;

@Data
@SuperBuilder
public class ElasticIndexVO {

  private String indexName;
  private String shards;
  private String replicas;
  private String refreshInterval;

}
