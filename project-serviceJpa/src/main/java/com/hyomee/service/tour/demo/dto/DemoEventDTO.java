package com.hyomee.service.tour.demo.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class DemoEventDTO extends AuditDTO {
  private int id;
  private String title;
  private String content;

  private String name;
}
