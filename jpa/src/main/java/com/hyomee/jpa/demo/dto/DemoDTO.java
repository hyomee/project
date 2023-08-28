package com.hyomee.jpa.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DemoDTO   {
  private int id;
  private String title;
  private String content;

  private String name;
}