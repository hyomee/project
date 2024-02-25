package com.hyomee.observer.pull;

public class SubscriberA implements Observer{

  private Subject subject ;
  public SubscriberA(Subject publisher) {
    this.subject = publisher ;
    this.subject.addObserver(this);
  }
  @Override
  public void update() {
    System.out.println("SubscriberA :: " +  this.subject.getMessage());
  }
}
