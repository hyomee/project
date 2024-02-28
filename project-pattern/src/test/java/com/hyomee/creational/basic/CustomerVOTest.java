package com.hyomee.creational.basic;

import com.hyomee.creational.builder.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerVOTest {

    @Test
    void createVo() {
        //CustomerVO customerVO = new CustomerVO();

    }

    @Test
    void createBuilder() {
        CutomerVO customerVO = new CutomerBuilder()
                .age("29")
                .name("홍깅동")
                .build();
        System.out.println(customerVO.toString());
    }

    @Test
    void createStaticBuilder() {
        CustomerSaticVO customerSaticVO = new CustomerSaticVO.Builder()
                .age("30")
                .name("홍길동")
                .build();
        System.out.println(customerSaticVO.toString());
    }

    @Test
    void createLombokBuilderVO() {
        LombokBuilderVO lombokBuilderVO = LombokBuilderVO.builder()
                .age("30")
                .name("홍길동")
                .build();
    }

    @Test
    void createLombokCreateBuilderVO() {
        LombokCreateBuilderVO lmbokCreateBuilderVO = LombokCreateBuilderVO.builder()
                .age("30")
                .name("홍길동")
                .build();
    }
}