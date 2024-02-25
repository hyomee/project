package com.hyomee.observer.push;

public class SubscriberB implements Observer {
  @Override
  public void update(String message) {
    System.out.println("SubscriberB :: " + message);
  }
}
