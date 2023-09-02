package com.hyomee.service.tour.demo.controller;

import com.hyomee.core.utils.ResponseUtils;
import com.hyomee.service.tour.demo.dto.DemoDTO;
import com.hyomee.service.tour.demo.dto.DemoEventDTO;
import com.hyomee.service.tour.demo.service.DemoEventService;
import com.hyomee.service.tour.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/demoevent")
public class DemoEventController {

  private final DemoEventService demoEventService;


  @GetMapping(value = "/{name}")
  public DemoEventDTO getDemoEvent(@PathVariable String name ) {
    return demoEventService.retrieveDemoEvent(name);
  }

  @PostMapping(value = "")
  public DemoEventDTO saveEventDemo(@RequestBody DemoEventDTO demoEventDTO) {
    return demoEventService.saveEventDemo(demoEventDTO);
  }

  @DeleteMapping(value = "/{id}")
  public boolean getDemo(@PathVariable String id ) {
    return demoEventService.deleteId(id);
  }



}
