package com.hyomee.service.tour.demo.service;


import com.hyomee.service.tour.demo.dto.DemoDTO;
import com.hyomee.service.tour.demo.entity.DemoEntity;
import com.hyomee.service.tour.demo.mapper.DemoDBMapper;
import com.hyomee.service.tour.demo.repository.DemoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoService {

  private final DemoRepository demoRepository;

  public List<DemoDTO> retrieveDemo() {
    List<DemoEntity> demoEntities = demoRepository.findAll();
    log.debug(demoEntities.toString());
    return DemoDBMapper.INSTANCE.toDTOs(demoEntities);
  }


  public DemoDTO saveDemo(DemoDTO demoDTO ) {
    DemoEntity demoEntity = DemoDBMapper.INSTANCE.toEntity(demoDTO);
    DemoEntity demoEntitySave = demoRepository.save(demoEntity);
    return DemoDBMapper.INSTANCE.toDTO(demoEntitySave);
  }


  public List<DemoDTO> retrieveDemo(String name , Pageable pageable) {
    Page<DemoEntity> demoEntity = demoRepository.findByNameContains(name, pageable);
    List<DemoEntity> demoEntities = demoEntity.getContent();

    return DemoDBMapper.INSTANCE.toDTOs(demoEntities);
  }

  public boolean deleteId(String id  ) {
    demoRepository.deleteById(Long.valueOf(id));
    return true;
  }

}
