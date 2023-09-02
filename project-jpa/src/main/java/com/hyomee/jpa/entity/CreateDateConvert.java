package com.hyomee.jpa.entity;

import com.hyomee.core.utils.DateTimeUtils;
import jakarta.persistence.AttributeConverter;

import java.time.LocalDateTime;

public class CreateDateConvert implements
        AttributeConverter<AuditVO, LocalDateTime> {


  @Override
  public LocalDateTime convertToDatabaseColumn(AuditVO attribute) {
    return attribute.getCreateDateTime();
  }

  @Override
  public AuditVO convertToEntityAttribute(LocalDateTime dbData) {
    AuditVO auditVO = new AuditVO();
    auditVO.setCreateDateTime(DateTimeUtils.convertTypeCurrentDateTime(dbData));
    return auditVO;
  }
}
