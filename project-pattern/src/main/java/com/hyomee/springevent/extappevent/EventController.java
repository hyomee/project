package com.hyomee.springevent.extappevent;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class EventController {

    private final CustomPublisherService customPublisherService;

    @GetMapping("/event/{message}")
    private void sendMessage(@PathVariable String message) {
        customPublisherService.customPublish(message);
        log.info("메세지 전송됩니다.");
    }
}
