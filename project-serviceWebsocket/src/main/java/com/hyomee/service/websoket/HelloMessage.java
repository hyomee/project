package com.hyomee.service.websoket;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class HelloMessage {
  @JsonProperty("name")
  private String name;
}
