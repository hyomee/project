package com.hyomee.designbasic.cars;


import com.hyomee.designbasic.attachDoorsBehavior.CarsWithDoors;
import com.hyomee.designbasic.exteriorBehavior.ExteriorGeneralCars;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
public class GeneralCars extends Cars{

  public GeneralCars() {
    attachDoorsBehavior = new CarsWithDoors();
    exteriorBehavior = new ExteriorGeneralCars();
  }


  public void makeAndrun() {
    System.out.println("** 자동차를 만들고 달린다. **");
  }
}
