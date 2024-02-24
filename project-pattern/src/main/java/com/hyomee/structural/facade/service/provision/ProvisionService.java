package com.hyomee.structural.facade.service.provision;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProvisionService {

    public void sendPpPvs() {
        log.debug("요금제에 따른 프로비저닝 요소를 연동한다.");
    }

    public void sendVasPvs() {
        log.debug("부가상품애 따른 프로비저닝 요소를 연동한다.");
    }

}
