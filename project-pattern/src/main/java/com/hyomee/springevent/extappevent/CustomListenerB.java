package com.hyomee.springevent.extappevent;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class CustomListenerB {
    @Async
    @EventListener
    public void handleCustom(CustomEventClassB customEventClassB) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(this.getClass().getName()
                + " "
                + customEventClassB.getMessage());
    }
}
