package com.hyomee.service.tour.demo.service;


import com.hyomee.service.tour.demo.dto.DemoEventDTO;
import com.hyomee.service.tour.demo.entity.DemoEventEntity;
import com.hyomee.service.tour.demo.mapper.DemoDBMapper;
import com.hyomee.service.tour.demo.mapper.DemoEventMapper;
import com.hyomee.service.tour.demo.repository.DemoEventRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DemoEventService {

  private final DemoEventRepository demoEventRepository;



  public DemoEventDTO saveEventDemo(DemoEventDTO demoEventDTO ) {
    DemoEventEntity demoEventEntity = DemoEventMapper.INSTANCE.toEntity(demoEventDTO);
    DemoEventEntity demoEventEntitySave = demoEventRepository.save(demoEventEntity);
    return  DemoEventMapper.INSTANCE.toDTO(demoEventEntitySave);
  }


  public DemoEventDTO retrieveDemoEvent(String name  ) {
    DemoEventEntity demoEventEntity = demoEventRepository.findByName(name);
       return  DemoEventMapper.INSTANCE.toDTO(demoEventEntity);
  }

  public boolean deleteId(String id  ) {
    demoEventRepository.deleteById(Long.valueOf(id));
    return true;
  }

}
