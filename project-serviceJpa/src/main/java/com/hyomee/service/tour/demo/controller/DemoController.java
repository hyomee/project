package com.hyomee.service.tour.demo.controller;

import com.hyomee.core.utils.ResponseUtils;

import com.hyomee.service.tour.demo.dto.DemoDTO;
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
@RequestMapping("/jpademo")
public class DemoController {

  private final DemoService demoService;

  @GetMapping(value = "")
  public ResponseEntity getDemoEntity(DemoDTO demoDTO) {
    List<DemoDTO> demoDTOs = demoService.retrieveDemo();
    return ResponseUtils.completed(demoDTOs);
  }

  @GetMapping(value = "/page/{name}")
  public List<DemoDTO> getDemo(@PathVariable String name,
                               Pageable pageable) {
    return demoService.retrieveDemo(name, pageable);
  }

  @PostMapping(value = "")
  public DemoDTO saveDemo(@RequestBody DemoDTO demoDTO) {
    return demoService.saveDemo(demoDTO);
  }

  @DeleteMapping(value = "/{id}")
  public boolean getDemo(@PathVariable String id ) {
    return demoService.deleteId(id);
  }



}
