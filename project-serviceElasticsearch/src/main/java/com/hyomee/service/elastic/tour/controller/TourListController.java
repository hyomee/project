package com.hyomee.service.elastic.tour.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.elastic.tour.service.TourListServie;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tourlist")
public class TourListController {

    private final TourListServie tourListServie;
    @GetMapping("/ec/title")
    // @RequestParam("title")
    public ResponseEntity getTitle(@RequestParam("searchValue") String searchValue) {
        return ResponseUtils.completed(tourListServie.getTourListByTitle(searchValue));
    }

    @GetMapping("/ec/title/{value}/{size}")
    public ResponseEntity getTitle(@RequestParam("searchValue") String searchValue,
                                   @PageableDefault(size = 10, value = 0) Pageable pageable) {
        return ResponseUtils.completed(tourListServie.getTourListByTitle(searchValue, pageable));
    }

    @GetMapping("/ec/overview")
    public ResponseEntity getTourListByOverview(@RequestParam("searchValue") String searchValue) {
        return ResponseUtils.completed(tourListServie.getTourListByOverview(searchValue));
    }



    @GetMapping("/ec/overview/{value}/{size}")
    public ResponseEntity getTourListByTitlePage(@RequestParam("searchValue") String searchValue,
                                                 @PageableDefault(size = 10, value = 0) Pageable pageable) {
        return ResponseUtils.completed(tourListServie.getTourListByOverview(searchValue, pageable));
    }

}
