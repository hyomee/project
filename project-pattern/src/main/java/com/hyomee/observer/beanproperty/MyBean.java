package com.hyomee.observer.beanproperty;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyBean {
  private String myProperty;
  private PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

  public void setMyProperty(String newValue) {
    String oldValue = myProperty;
    myProperty = newValue;
    propertyChangeSupport.firePropertyChange("myProperty", oldValue, newValue);
  }

  public String getMyProperty() {
    return myProperty;
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    propertyChangeSupport.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener) {
    propertyChangeSupport.removePropertyChangeListener(listener);
  }
}
