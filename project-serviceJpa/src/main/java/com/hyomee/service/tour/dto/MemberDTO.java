package com.hyomee.service.tour.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class MemberDTO extends AuditDTO {

    private String memberNo;

    private String memberId;

    private String name;

    private String pwd;

    private String birth;

    private String gender;

    private String phone;

    private String email;
}