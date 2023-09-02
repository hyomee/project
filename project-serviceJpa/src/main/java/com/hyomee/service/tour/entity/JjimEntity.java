package com.hyomee.service.tour.entity;

import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "TB_JJIM")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Entity
@Builder
public class JjimEntity  extends AuditVO {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    private String jjimNo;

    @Column(length = 36)
    private String memberNo;

    // 관광지를 추천했을때
    @Column(length = 10)
    private String recommend_contentid;

    // 이 관광지 넣어서 Planner를 만들었을때
    @Column(length = 10)
    private String add_contentid;
}