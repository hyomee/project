package com.hyomee.es.dto;

import lombok.Builder;
import lombok.Data;

@Data
@SuperBuilder
public class PageDTO {

  private long total;
  private int pageNumber;
  private int pageCount;
  private int pageSize;
}
