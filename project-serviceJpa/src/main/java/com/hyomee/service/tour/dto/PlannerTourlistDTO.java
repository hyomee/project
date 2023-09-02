package com.hyomee.service.tour.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class PlannerTourlistDTO {

        private String plannerTourlistNo;

        private String plannerNo;

        private String contentid;

        private String tourSeq;

        private String tourDay;
    }

