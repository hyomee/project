package com.hyomee.springevent.extappevent;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class CustomEventClassA extends ApplicationEvent {

    @Getter
    private String message;

    public CustomEventClassA(Object source, String message) {
        super(source);
        this.message = message;
    }
}
