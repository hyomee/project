package com.hyomee.service.solution.repeat.service.service;

import com.hyomee.service.solution.repeat.svc.service.SvcService;
import jakarta.annotation.Resource;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

// @RequiredArgsConstructor
@Service
public class SubscriberServiceImpl implements SubscriberService {

    // @Qualifier( "productChg")
    // private final SvcService productChgSvcService;


    // @Qualifier( "subscriber")
    // private final SvcService subscriberSvcService;


    @Resource(name = "productChg")
    private  SvcService productChgSvcService;

    @Resource(name = "subscriber")
    private  SvcService subscriberSvcService;

    public void processEntr() {
        productChgSvcService.process("01093698787");
        subscriberSvcService.process("01094115479");
    }


}
