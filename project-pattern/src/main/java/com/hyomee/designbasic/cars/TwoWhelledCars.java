package com.hyomee.designbasic.cars;

import com.hyomee.designbasic.attachDoorsBehavior.CarsWithoutDoors;
import com.hyomee.designbasic.exteriorBehavior.ExteriorTwoWhelledCars;

public class TwoWhelledCars extends Cars{

  public TwoWhelledCars() {
    super.attachDoorsBehavior = new CarsWithoutDoors();
    super.exteriorBehavior = new ExteriorTwoWhelledCars();
  }
  public void makeAndrun() {
    System.out.println("** 오토바이 or 자전거 같은 이륜형 차를 만들고 달린다. **");
  }

}
