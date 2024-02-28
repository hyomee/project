package com.hyomee.creational.builder;

import lombok.Builder;

public class LombokCreateBuilderVO {
    private String name;
    private String age;

    @Builder
    public LombokCreateBuilderVO(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
