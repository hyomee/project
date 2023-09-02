package com.hyomee.jpa.entity;

import com.hyomee.core.utils.DateTimeUtils;
import jakarta.persistence.AttributeConverter;

import java.time.LocalDateTime;

public class UpdateDateConvert implements
        AttributeConverter<AuditVO, LocalDateTime> {


  @Override
  public LocalDateTime convertToDatabaseColumn(AuditVO attribute) {

    return attribute.getUpdateDataTime();
  }

  @Override
  public AuditVO convertToEntityAttribute(LocalDateTime dbData) {
    AuditVO auditVO = new AuditVO();
    auditVO.setUpdateDataTime(DateTimeUtils.convertTypeCurrentDateTime(dbData));
    return auditVO;
  }
}
