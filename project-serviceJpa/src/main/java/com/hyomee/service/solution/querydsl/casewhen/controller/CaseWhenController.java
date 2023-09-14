package com.hyomee.service.solution.querydsl.casewhen.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.solution.querydsl.casewhen.service.CaseWhenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/casewhen")
public class CaseWhenController {

    private final CaseWhenService caseWhenService;

    @GetMapping("/dataLoading")
    public ResponseEntity dataLoading() {
       return ResponseUtils.completed(caseWhenService.dataLoading());
    }

    @GetMapping("/caseWhenSubQuery")
    public ResponseEntity caseWhenSubQuery() {
        return ResponseUtils.completed(caseWhenService.caseWhenSubQuery());
    }

}
