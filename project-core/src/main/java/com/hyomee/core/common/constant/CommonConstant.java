package com.hyomee.core.common.constant;

public class CommonConstant {
  public final static String NO_ERR_CD =  "ERR_0000";
  public final static String NO_ERR_MSG =  "ERR_0001";

  public final static String COMMON_EMPTY =  "";
  public final static Boolean COMMON_TRUE = true;
  public final static Boolean COMMON_FALSE = false;

  public final static String PATTERN_DATE = "yyyy-MM-dd";
  public final static String PATTERN_TIME = "HH:mm:ss";
  public final static String PATTERN_DATETIME = String.format("%s %s", PATTERN_DATE, PATTERN_TIME);
}
