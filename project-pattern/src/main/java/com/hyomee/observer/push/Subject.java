package com.hyomee.observer.push;

public interface Subject {
  public void addObserver(Observer ob);
  public void removeObserver(Observer ob);
  public void notifyChange(String message);
}
