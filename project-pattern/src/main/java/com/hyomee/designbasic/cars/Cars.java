package com.hyomee.designbasic.cars;

import com.hyomee.designbasic.attachDoorsBehavior.AttachDoorsBehavior;
import com.hyomee.designbasic.exteriorBehavior.ExteriorBehavior;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Cars {
  protected AttachDoorsBehavior attachDoorsBehavior;
  protected ExteriorBehavior exteriorBehavior;

  public void makeExterior() {
    exteriorBehavior.makeExterior();
  }

  public void attachDoors() {
    attachDoorsBehavior.attachDoors();
  }

  public void run() {
    System.out.println("차는 달린다.");
  }
}

