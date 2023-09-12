package com.hyomee.service.solution.querydsl.casewhen.entity;

import com.hyomee.core.utils.DateTimeUtils;
import com.hyomee.core.utils.UuidUtils;
import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Table(name = "TB_UNIT_SVC_M")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class UnitSvcMEntity extends AuditVO implements Serializable {

    @Id
    private String unitSvcId;           // 단위 서비스 PK
    private String unitId;          // pk 메인 아이디
    private String rcptDttm;            // 등록 일자
    private String odrRcptId;           // 오더 아이디
    private String sendMsgCntn;         // 발송 메세지
    private String unitSvcDivCd;        // 단위서비스
    private String prssRsltCd;          // 진행 결과

    public static String getUnitId() {
        return "UNIT_" + DateTimeUtils.getStringCurrentDateTimeEmp() +  UuidUtils.getUUID().substring(UuidUtils.getUUID().length()-6,UuidUtils.getUUID().length());
    }
}
