package com.hyomee.core.mapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class DateCustomMapper {
  public LocalDateTime createDateTime(Timestamp timestamp) {
    return timestamp == null ? null : timestamp.toLocalDateTime();
  }

  public Timestamp createDateTime(LocalDateTime localDateTime) {
    return localDateTime == null ? null : Timestamp.valueOf(localDateTime);
  }

  public LocalDateTime updateDataTime(Timestamp timestamp) {
    return timestamp == null ? null : timestamp.toLocalDateTime();
  }

  public Timestamp updateDataTime(LocalDateTime localDateTime) {
    return localDateTime == null ? null : Timestamp.valueOf(localDateTime);
  }
}

