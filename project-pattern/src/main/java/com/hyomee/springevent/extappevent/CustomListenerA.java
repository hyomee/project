package com.hyomee.springevent.extappevent;

import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomListenerA implements ApplicationListener<CustomEventClassA> {
    @Async
    @Override
    public void onApplicationEvent(CustomEventClassA customEventClassA) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(this.getClass().getName()
                + " "
                + customEventClassA.getMessage());
    }
}
