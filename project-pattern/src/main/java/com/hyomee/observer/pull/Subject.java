package com.hyomee.observer.pull;

public interface Subject {
  void addObserver(Observer ob);
  void removeObserver(Observer ob);
  void notifyChange();
  String getMessage();

}
