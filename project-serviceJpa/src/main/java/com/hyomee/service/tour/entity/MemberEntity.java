package com.hyomee.service.tour.entity;

import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Table(name = "TB_MEMBER")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class MemberEntity extends AuditVO {

    @Id
    @Column(length = 36)
    @GeneratedValue(strategy = GenerationType.UUID)
    private String memberNo;

    @Column(length = 32)
    private String memberId;

    @Column(length = 200)
    private String name;

    @Column(length = 100)
    private String pwd;

    @Column(length = 100)
    private String birth;

    @Column(length = 1)
    private String gender;

    @Column(length = 100)
    private String phone;

    @Column(length = 100)
    private String email;
}
