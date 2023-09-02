package com.hyomee.service.tour.demo.mapper;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.demo.dto.DemoDTO;
import com.hyomee.service.tour.demo.entity.DemoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemoDBMapper extends StructMapper<DemoDTO, DemoEntity> {
  DemoDBMapper INSTANCE = Mappers.getMapper(DemoDBMapper.class);

}
