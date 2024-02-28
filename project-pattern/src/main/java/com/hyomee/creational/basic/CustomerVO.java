package com.hyomee.creational.basic;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class CustomerVO {
    private String customerNo;
    private String name;
    private String customerId;
    private String age;

    public CustomerVO(String customerNo,
                      String name) { }

}


