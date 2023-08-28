package com.hyomee.service.tour.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TourlistDTO {

  private String contentid;
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
}
