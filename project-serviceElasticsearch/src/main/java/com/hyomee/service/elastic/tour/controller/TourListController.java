package com.hyomee.service.elastic.tour.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.elastic.tour.service.TourListServie;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tourlist")
public class TourListController {

    private final TourListServie tourListServie;
    @GetMapping("/ec/title/{}")
    // @RequestParam("title")
    public ResponseEntity getTitle(@RequestParam("title") String title) {
        return ResponseUtils.completed(tourListServie.getTourListByTitleEq(title));
    }

    @GetMapping("/ec/overview")
    public ResponseEntity getTourListByOverview(@RequestParam("overview") String overview) {
        return ResponseUtils.completed(tourListServie.getTourListByOverview(overview));
    }

}
