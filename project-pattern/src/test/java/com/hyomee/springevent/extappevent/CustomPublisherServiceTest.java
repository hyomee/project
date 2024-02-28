package com.hyomee.springevent.extappevent;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.EnableAsync;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomPublisherServiceTest {

    @Autowired
    private CustomPublisherService customPublisherService;

    @Test
    void customPublish() {
        customPublisherService.customPublish("메세지 전달");

    }
}