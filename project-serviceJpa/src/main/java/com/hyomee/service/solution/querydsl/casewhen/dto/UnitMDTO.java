package com.hyomee.service.solution.querydsl.casewhen.dto;

import com.querydsl.core.annotations.QueryProjection;
import jakarta.persistence.Column;
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
public class UnitMDTO {

    private String unitId;          // pk 메인 아이디
    private String rcptDttm;    // 접수 일자

    private String odrRcptId;       // 오더아이디
    private String odrEvntNm;       // 이벤트
    private String pgrsStusCd;      // 진행상태
    private String prssRstCs;       // 결과상태
    private String substrUnitId;
    private String castId;
}
