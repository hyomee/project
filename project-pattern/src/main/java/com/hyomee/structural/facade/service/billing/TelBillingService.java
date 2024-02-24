package com.hyomee.structural.facade.service.billing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TelBillingService {

    public void sendPpTelBill() {
        log.debug("요금상품에 따른 과금 요소를 연동한다.");
    }

    public void sendVasTelBill() {
        log.debug("부가상품에 따른 과금 요소를 연동한다.");
    }
}
