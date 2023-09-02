package com.hyomee.service.tour.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class PlannerTourlistDTO extends AuditDTO {

        private String plannerTourlistNo;

        private String plannerNo;

        private String contentid;

        private String tourSeq;

        private String tourDay;
}

