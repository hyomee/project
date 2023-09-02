package com.hyomee.core.utils;

import lombok.extern.java.Log;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeUtils {

  public static LocalDateTime getCurrentDateTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String time = LocalDateTime.now().format(formatter);
    return LocalDateTime.parse(time, formatter);
  }


  public static LocalDateTime convertTypeCurrentDateTime(LocalDateTime ls) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String time = ls.format(formatter);
    return LocalDateTime.parse(time, formatter);
  }

}
