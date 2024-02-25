package com.hyomee.observer.push;

public class SubscriberA implements Observer {
  @Override
  public void update(String message) {
    System.out.println("SubscriberA :: " + message);
  }
}
