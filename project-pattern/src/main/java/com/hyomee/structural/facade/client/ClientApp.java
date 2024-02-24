package com.hyomee.structural.facade.client;

import com.hyomee.structural.facade.service.ChangeProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientApp {

    private final ChangeProductService changeProductService;
    public void changePp() {
        changeProductService.changePp();
    }
}
