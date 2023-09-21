package com.hyomee.service.solution.repeat.service.controller;

import com.hyomee.service.solution.repeat.service.service.SubscriberService;
import com.hyomee.service.solution.repeat.svc.service.SvcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class SubscriberController {
    private final SubscriberService subscriberService;

    @GetMapping("/processSubscriberService")
    public void processSubscriberService() {
        subscriberService.processEntr();
    }

}
