package com.hyomee.structural.facade.service;

import com.hyomee.structural.facade.service.billing.BillingService;
import com.hyomee.structural.facade.service.billing.TelBillingService;
import com.hyomee.structural.facade.service.discount.DiscountService;
import com.hyomee.structural.facade.service.product.PricePlanService;
import com.hyomee.structural.facade.service.product.VasService;
import com.hyomee.structural.facade.service.provision.ProvisionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangeProductService {

    private final PricePlanService pricePlanService;
    private final VasService vasService;
    private final BillingService billingService;
    private final DiscountService discountService;

    public void changePp() {
        pricePlanService.changePp();
        vasService.changeVas();
        billingService.sendBilling();
        discountService.chgEntrDc();
    }
}
