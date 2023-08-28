package com.hyomee.service.init.controller;

import com.hyomee.core.common.constant.CommonConstant;
import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.init.service.TourlistLoagingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/init")
public class InitLoadingController {

  private final TourlistLoagingService tourlistLoagingService;

  @GetMapping("/tourlist/{filename}")
  public ResponseEntity loadingTourlist(@PathVariable String filename) {
    tourlistLoagingService.loadingTourlist(filename);
    return ResponseUtils.completed(CommonConstant.COMMON_TRUE);
  }


}
