package com.hyomee.service.tour.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class JjimDTO extends AuditDTO {

    private String jjimNo;

    private String memberNo;

    private String recommend_contentid;

    private String add_contentid;
}
