package com.hyomee.observer.beanproperty;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyBeanTest {

  @Test
  void addPropertyChangeListener() {
    MyBean myBean = new MyBean();
    MyPropertyChangeListener listener = new MyPropertyChangeListener();

    myBean.addPropertyChangeListener(listener);

    myBean.setMyProperty("JAVA API Level : 옵저버 : Bean의 속성 초기값");
    myBean.setMyProperty("JAVA API Level : 옵저버 : Bean의 속성 변경");
  }
}