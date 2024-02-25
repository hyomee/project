package com.hyomee.observer.push;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PublisherTest {

  @Test
  void messageChange() {
    Publisher publisher = new Publisher();

    Observer subscriberA = new SubscriberA();
    Observer subscriberB = new SubscriberB();

    publisher.addObserver(subscriberA);
    publisher.addObserver(subscriberB);

    publisher.messageChange("Push 메세지 전달 1 ");
    publisher.messageChange("Push 메세지 전달 2 ");
  }
}

