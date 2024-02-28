package com.hyomee.springevent.extappevent;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomPublisherService {

    private final ApplicationEventPublisher applicationEventPublisher;

    public void customPublish(String message) {
        applicationEventPublisher.publishEvent(new CustomEventClassA(this, message));
        applicationEventPublisher.publishEvent(new CustomEventClassB(message));
    }
}
