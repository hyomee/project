package com.hyomee.service.tour.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class PlannerDTO extends AuditDTO {

    private String plannerNo;

    private String memberId;

    private String region;

    private String startDate;

    private String endDate;

}
