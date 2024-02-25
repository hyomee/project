package com.hyomee.observer.push;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
  private List<Observer> observerList;
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
  public void notifyChange(String message) {
    for(int i = 0; i < this.observerList.size() ; i++) {
      Observer obs = observerList.get(i);
      obs.update(message);
    }
  }
  public void messageChange(String message) {
    notifyChange(message);
  }
}
