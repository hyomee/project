package com.hyomee.service.elastic.tour.controller;


import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.elastic.tour.service.WordSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RequiredArgsConstructor
@RestController
@RequestMapping("/wordSearch")
public class WordSearchController {

    private final WordSearchService wordSearchService;

    @PutMapping("/{words}")
    public ResponseEntity saveWordSearch(@PathVariable String words) {
        return ResponseUtils.completed(wordSearchService.saveWordSearch(words));
    }

    @GetMapping("/getTags/{fieldname}/{size}")
    public ResponseEntity saveWordSearch(@PathVariable String fieldname,
                                         @PathVariable int size) throws IOException {
        return ResponseUtils.completed(wordSearchService.getTopTags(fieldname, size));
    }

}
