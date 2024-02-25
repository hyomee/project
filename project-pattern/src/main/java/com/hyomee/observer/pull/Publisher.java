package com.hyomee.observer.pull;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
  private List<Observer> observerList;

  @Getter
  private String message;

  public Publisher() {
    this.observerList = new ArrayList<>();
  }

  @Override
  public void addObserver(Observer observer) {
    this.observerList.add(observer);
  }
  @Override
  public void removeObserver(Observer observer) {
    this.observerList.remove(observer);
  }
  @Override
  public void notifyChange() {
    for(Observer observer : this.observerList  ) {
      observer.update();
    }
  }
  public void messageChange(String message) {
    this.message = message;
    notifyChange();
  }
}
