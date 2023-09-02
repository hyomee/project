package com.hyomee.service.tour.entity;

import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Table(name = "TB_PLANNER_TOURLIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class PlannerTourlistEntity extends AuditVO {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(length = 36)
    private String plannerTourlistNo;

    @Column(length = 36)
    private String plannerNo;

    @Column(length = 20)
    private String contentid;

    @Column(length = 10)
    private String tourSeq;

    @Column(length = 20)
    private String  tourDay;
}