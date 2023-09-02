package com.hyomee.service.tour.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Builder
public class JjimDTO {

    private String jjimNo;

    private String memberNo;

    private String recommend_contentid;

    private String add_contentid;
}
