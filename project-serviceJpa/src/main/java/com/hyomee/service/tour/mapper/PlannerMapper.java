package com.hyomee.service.tour.mapper;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.dto.PlannerDTO;
import com.hyomee.service.tour.entity.PlannerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface PlannerMapper extends StructMapper<PlannerDTO, PlannerEntity> {
    PlannerMapper INSTANCE = Mappers.getMapper(PlannerMapper.class);
}