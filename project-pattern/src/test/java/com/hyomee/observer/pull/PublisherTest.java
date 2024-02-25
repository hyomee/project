package com.hyomee.observer.pull;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PublisherTest {

  @Test
  void messageChange() {

    Publisher  publisher = new Publisher();

    Observer subscriberA = new SubscriberA(publisher);
    Observer subscriberB = new SubscriberB(publisher);

    publisher.messageChange("Pull 메세지 전달 1");
    publisher.messageChange("Pull 메세지 전달 2");
  }
}