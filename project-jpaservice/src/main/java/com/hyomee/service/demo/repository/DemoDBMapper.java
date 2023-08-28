package com.hyomee.service.demo.repository;


import com.hyomee.service.demo.dto.DemoDTO;
import com.hyomee.service.demo.entity.DemoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemoDBMapper {
  DemoDBMapper INSTANCE = Mappers.getMapper(DemoDBMapper.class);

  List<DemoDTO> toDemoDTOs(List<DemoEntity> demoEntities);
  DemoEntity toDemoEntitys(DemoDTO demoDTO);
  DemoDTO toDemoDTO(DemoEntity eemoEntity);
}
