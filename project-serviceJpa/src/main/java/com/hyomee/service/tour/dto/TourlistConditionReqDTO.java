package com.hyomee.service.tour.dto;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class TourlistConditionReqDTO {
  private String title;
  private String zipcode;
  private String addr;
  private String tel;
}
