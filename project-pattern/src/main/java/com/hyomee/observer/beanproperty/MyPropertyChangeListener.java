package com.hyomee.observer.beanproperty;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MyPropertyChangeListener implements PropertyChangeListener {
  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    String propertyName = evt.getPropertyName();
    Object oldValue = evt.getOldValue();
    Object newValue = evt.getNewValue();

    System.out.println("Property changed: " + propertyName);
    System.out.println("Old value: " + oldValue);
    System.out.println("New value: " + newValue);
    System.out.println();
  }
}

