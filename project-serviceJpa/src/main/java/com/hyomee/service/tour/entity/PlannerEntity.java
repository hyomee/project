package com.hyomee.service.tour.entity;

import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Table(name = "TB_PLANNER")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class PlannerEntity extends AuditVO {

    @Id
    @Column(length = 36)
    private String plannerNo;

    @Column(length = 36)
    private String memberId;

    @Column(length = 4)
    private String region;

    @Column(length = 40)
    private String startDate;

    @Column(length = 40)
    private String endDate;

}