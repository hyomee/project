package com.hyomee.core.utils;


import com.hyomee.core.common.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;

import java.sql.Timestamp;

public class ResponseUtils {

  public static ResponseEntity<Object> completed(Object obj) {

//    ResponseDTO responseDTO = ResponseDTO.builder()
//            .code(String.valueOf(HttpStatus.OK.value()))
//            .message(CommonConstant.COMMON_EMPTY)
//            .error(CommonConstant.COMMON_EMPTY)
//            .status(HttpStatus.OK.value())
//            .path(RequestUtils.getHttpServletRequest().getRequestURL().toString())
//            .timestamp(String.valueOf(new Timestamp(System.currentTimeMillis())))
//            .data(obj)
//            .build();

    return ResponseEntity.status(HttpStatus.OK.value()).body(obj);

  }

  public static DeferredResult<ResponseEntity<?>> completedDeferredResult(Object obj, Long waitTime ) {
      DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>(waitTime);
      deferredResult.onTimeout(new Runnable() {
        @Override
        public void run() {
          deferredResult.setErrorResult(
                  ResponseEntity.status(HttpStatus.REQUEST_TIMEOUT).body("시간 초과 입니다."));
        }
      });

      deferredResult .setResult(ResponseEntity.status(HttpStatus.OK.value()).body(obj));
    return deferredResult ;

  }

  public static DeferredResult<ResponseEntity<?>> errorDeferredResult(Object obj, Exception e ) {
    DeferredResult<ResponseEntity<?>> deferredResult = new DeferredResult<>();

    ResponseDTO responseDTO = ResponseDTO.builder()
            .code(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
            .message(e.getMessage())
            .error("Exception")
            .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
            .path(RequestUtils.getHttpServletRequest().getRequestURL().toString())
            .timestamp(String.valueOf(new Timestamp(System.currentTimeMillis())))
            .data("Error :: No Data")
            .build();

    deferredResult .setResult(ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR.value()).body(obj));
    return deferredResult ;

  }

}
