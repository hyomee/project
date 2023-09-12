package com.hyomee.service.solution.querydsl.casewhen.dto;

import com.hyomee.jpa.dto.AuditDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@SuperBuilder
public class PvsOrderDTO extends AuditDTO {

    private String mainId;          // pk 메인 아이디
    private String mainRcptDttm;    // 접수 일자
    private String odrRcptId;       // 오더아이디
    private String odrEvntNm;       // 이벤트
    private String pgrsStusCd;      // 진행상태
    private String prssRstCs;       // 결과상태

}

