package com.hyomee.designbasic.cars;

import com.hyomee.designbasic.attachDoorsBehavior.CarsWithDoors;
import com.hyomee.designbasic.attachDoorsBehavior.CarsWithoutDoors;
import com.hyomee.designbasic.exteriorBehavior.ExteriorGeneralCars;
import com.hyomee.designbasic.exteriorBehavior.ExteriorTwoWhelledCars;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExteriorGeneralCarsTest {



  @Test
  void makeAndrun() {
    GeneralCars generalCars = new GeneralCars();
    generalCars.makeAndrun();
    generalCars.makeExterior();
    generalCars.attachDoors();
    generalCars.run();

    TwoWhelledCars twoWhelledCars = new TwoWhelledCars();
    twoWhelledCars.makeAndrun();
    twoWhelledCars.makeExterior();
    twoWhelledCars.attachDoors();
    twoWhelledCars.run();
  }

}