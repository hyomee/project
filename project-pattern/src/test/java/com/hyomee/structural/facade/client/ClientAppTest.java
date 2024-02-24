package com.hyomee.structural.facade.client;

import com.hyomee.structural.facade.service.ChangeProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClientAppTest {

    @Autowired
    private ChangeProductService changeProductService;
    @Test
    void changePp() {
        changeProductService.changePp();
    }
}