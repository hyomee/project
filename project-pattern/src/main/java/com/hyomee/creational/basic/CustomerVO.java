package com.hyomee.creational.basic;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class CustomerVO {
    private String customerNo;
    private String name;
    private String customerId;
    private String age;

    // 부생성자
    public CustomerVO(YoungCustomerVO youngCustomerVO) {
        this(youngCustomerVO.getCustomerNo(),
                youngCustomerVO.getName(),
                youngCustomerVO.getCustomerId(),
                youngCustomerVO.getAge());
    }

    // 정적 팩토리 메서드 (static factory method)
    public static CustomerVO newYoungCustomerVO(YoungCustomerVO youngCustomerVO) {
        return new CustomerVO(youngCustomerVO.getCustomerNo(),
                youngCustomerVO.getName(),
                youngCustomerVO.getCustomerId(),
                youngCustomerVO.getAge());
    }

}
