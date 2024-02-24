package com.hyomee.structural.facade.service.billing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BillingService {

    public void sendBilling() {
        log.debug("청구에 인터페이스 한다.");
    }
}
