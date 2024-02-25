package com.hyomee.designbasic.exteriorBehavior;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
public class ExteriorTruckCars implements ExteriorBehavior {
  @Override
  public void makeExterior() {
    System.out.println("트럭 종류 자동차 외관을 만든다.");
  }
}
