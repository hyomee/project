package com.hyomee.observer.pull;

public class SubscriberB implements Observer{
  private Subject subject ;

  public SubscriberB(Subject publisher) {
    this.subject = publisher ;
    this.subject.addObserver(this);
  }

  @Override
  public void update() {
    System.out.println("SubscriberB :: " + this.subject.getMessage());
  }
}
