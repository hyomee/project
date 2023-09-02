package com.hyomee.service.tour.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class TourlistDTO {

  private String contentid;
  private String contenttypeid;
  private String cat1;
  private String cat2;
  private String cat3;
  private String title;
  private String zipcode;
  private String addr;
  private String addr2;
  private String tel;
  private String areacode;
  private String sigungucode;
  private String firstimage;
  private String firstimage2;
  private String overview;
  private String mapx;
  private String mapy;
  private int recommendCount;
  private int addCount;
}
