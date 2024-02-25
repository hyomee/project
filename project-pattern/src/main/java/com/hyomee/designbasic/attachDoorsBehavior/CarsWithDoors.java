package com.hyomee.designbasic.attachDoorsBehavior;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
public class CarsWithDoors implements AttachDoorsBehavior{
  @Override
  public void attachDoors() {
    System.out.println("문이 있는 자동차");
  }
}
