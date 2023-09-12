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

  public static String getStringCurrentDateTime() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    return LocalDateTime.now().format(formatter);
  }

  public static String getStringCurrentDateTimeEmp() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    return LocalDateTime.now().format(formatter) ;
  }

  public static LocalDateTime convertTypeCurrentDateTime(LocalDateTime ls) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String time = ls.format(formatter);
    return LocalDateTime.parse(time, formatter);
  }

  public static LocalDateTime getCurrentTimeStamp() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
    String time = LocalDateTime.now().format(formatter);
    return LocalDateTime.parse(time, formatter);
  }

}
