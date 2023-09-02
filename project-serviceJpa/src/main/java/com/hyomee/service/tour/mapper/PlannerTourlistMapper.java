package com.hyomee.service.tour.mapper;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.dto.PlannerTourlistDTO;
import com.hyomee.service.tour.entity.PlannerTourlistEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/*
    PlannerTourlistDTO 아직 없음
 */
@Mapper
public interface PlannerTourlistMapper extends StructMapper<PlannerTourlistDTO, PlannerTourlistEntity> {
    PlannerTourlistMapper INSTANCE = Mappers.getMapper(PlannerTourlistMapper.class);
}
