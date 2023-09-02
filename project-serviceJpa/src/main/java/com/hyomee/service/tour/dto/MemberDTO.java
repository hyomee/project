package com.hyomee.service.tour.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class MemberDTO {

    private String memberNo;

    private String memberId;

    private String name;

    private String pwd;

    private String birth;

    private String gender;

    private String phone;

    private String email;
}