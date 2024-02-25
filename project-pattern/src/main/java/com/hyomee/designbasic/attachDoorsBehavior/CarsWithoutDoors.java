package com.hyomee.designbasic.attachDoorsBehavior;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Slf4j
public class CarsWithoutDoors implements AttachDoorsBehavior {
  @Override
  public void attachDoors() {
    System.out.println("문이 없는 자동차");
  }
}
