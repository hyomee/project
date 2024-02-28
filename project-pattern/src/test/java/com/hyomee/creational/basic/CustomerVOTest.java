package com.hyomee.creational.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerVOTest {
    @Test
    void creationalClass() {
        YoungCustomerVO youngVO = new YoungCustomerVO(
                "C0001",
                "홍길동",
                "CUST_001",
                "20"
        );

        CustomerVO customerVO = CustomerVO.newYoungCustomerVO(youngVO);

        System.out.println(customerVO.toString());
    }
}