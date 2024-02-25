package com.hyomee.designbasic.exteriorBehavior;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
public class ExteriorTwoWhelledCars implements ExteriorBehavior {
  @Override
  public void makeExterior() {
    System.out.println("오토바이 or 자전거 같은 이륜형 외형 만들기");
  }
}
