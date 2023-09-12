package com.hyomee.service.solution.querydsl.casewhen.entity;

import com.hyomee.core.utils.DateTimeUtils;
import com.hyomee.core.utils.UuidUtils;
import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.UUID;

@Table(name = "TB_UNIT_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class UnitMEntity extends AuditVO implements Serializable {
    @Id
    @Column(length = 32)
    private String unitId;          // pk 메인 아이디

    @Column(nullable = false)
    private String rcptDttm;    // 접수 일자

    @Column(nullable = false)
    private String odrRcptId;       // 오더아이디
    private String odrEvntNm;       // 이벤트
    private String pgrsStusCd;      // 진행상태
    private String prssRstCs;       // 결과상태


    public static String getUnitId() {
        return "MAIN_" + DateTimeUtils.getStringCurrentDateTimeEmp() + UuidUtils.getUUID().substring(UuidUtils.getUUID().length()-6,UuidUtils.getUUID().length());
    }

}
