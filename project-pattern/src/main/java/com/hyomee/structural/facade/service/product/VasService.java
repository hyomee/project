package com.hyomee.structural.facade.service.product;

import com.hyomee.structural.facade.service.billing.TelBillingService;
import com.hyomee.structural.facade.service.discount.DiscountService;
import com.hyomee.structural.facade.service.provision.ProvisionService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class VasService {

    private final DiscountService discountService;
    private final TelBillingService telBillingService;
    private final ProvisionService provisionService;

    public void changeVas() {
        log.debug("부가 상품을 변경 한다.");
        discountService.chgVasDc();
        telBillingService.sendVasTelBill();
        provisionService.sendVasPvs();
    }
}
