package com.hyomee.service.tour.demo.mapper;


import com.hyomee.core.mapper.DateCustomMapper;
import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.demo.dto.DemoEventDTO;
import com.hyomee.service.tour.demo.entity.DemoEventEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface DemoEventMapper extends StructMapper<DemoEventDTO, DemoEventEntity> {
  DemoEventMapper INSTANCE = Mappers.getMapper(DemoEventMapper.class);


}
