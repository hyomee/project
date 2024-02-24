package com.hyomee.structural.facade.service.discount;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DiscountService {

    public void chgEntrDc() {
        log.debug("가입에 따른 할인을 변겸 및 등록 한다.");
    }

    public void chgPpDc() {
        log.debug("요금제에 따른 종속 할인을 변겸 및 등록 한다.");
    }

    public void chgVasDc() {
        log.debug("부가상품에 따른 종속 할인을 변겸 및 등록 한다.");
    }

}
