package com.hyomee.creational.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class CustomerSaticVO {
    private String name;
    private String age;

    public CustomerSaticVO(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }


    public static class Builder {
        private String name;
        private String age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public CustomerSaticVO build() {
            return new CustomerSaticVO(this);
        }
    }
}
