package com.hyomee.service.elastic.tour.controller;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListeReqDTO;
import com.hyomee.service.elastic.tour.service.TourListServie;
import jakarta.websocket.server.PathParam;
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
    @GetMapping("/es/title")
    // @RequestParam("title")
    public ResponseEntity getTitle(@RequestParam("searchValue") String searchValue) {
        return ResponseUtils.completed(tourListServie.getTourListByTitle(searchValue));
    }

    @GetMapping("/es/title/pageing")
    public ResponseEntity getTitle(@RequestParam("searchValue") String searchValue,
                                  @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseUtils.completed(tourListServie.getTourListByTitle(searchValue, pageable));
    }

    @GetMapping("/es/overview")
    public ResponseEntity getTourListByOverview(@RequestParam("searchValue") String searchValue) {
        return ResponseUtils.completed(tourListServie.getTourListByOverview(searchValue));
    }


    @GetMapping("/es/overview/pageing")
    public ResponseEntity getTourListByTitlePage(@RequestParam("searchValue") String searchValue,
                                                 @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseUtils.completed(tourListServie.getTourListByOverview(searchValue, pageable));
    }

    @GetMapping("/es/overview/hits")
    public ResponseEntity getTourListByTitlehits(@RequestParam("searchValue") String searchValue,
                                                 @PageableDefault(size = 10, page = 0) Pageable pageable) {
        return ResponseUtils.completed(tourListServie.findHitsByOverview(searchValue, pageable));
    }

    @GetMapping("/es/match")
    public ResponseEntity getTourListByTitlehits( @RequestBody TourListeReqDTO tourListeReqDTO ) {
        return ResponseUtils.completed(tourListServie.findTourListDocByMatch(tourListeReqDTO));
    }

}
