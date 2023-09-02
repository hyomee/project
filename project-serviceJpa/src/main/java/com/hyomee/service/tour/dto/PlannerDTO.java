package com.hyomee.service.tour.dto;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class PlannerDTO {

    private String plannerNo;

    private String memberId;

    private String region;

    private String startDate;

    private String endDate;

    private String localDateTime;

}
