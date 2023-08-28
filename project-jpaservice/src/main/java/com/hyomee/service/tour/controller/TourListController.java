package com.hyomee.service.tour.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.tour.dto.TourlistConditionReqDTO;
import com.hyomee.service.tour.service.TourListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tourlist")
public class TourListController {

    private final TourListService tourListService;

    @GetMapping("/qdsl")
    public ResponseEntity getTourlistByTitleContains(@RequestBody TourlistConditionReqDTO tourlistConditionReqDTO) {
        return ResponseUtils.completed(tourListService.findTourlist(tourlistConditionReqDTO));
    }
}
