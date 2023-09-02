package com.hyomee.service.tour.mapper;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.dto.JjimDTO;
import com.hyomee.service.tour.entity.JjimEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface JjimMapper extends StructMapper<JjimDTO, JjimEntity> {
    JjimMapper INSTANCE = Mappers.getMapper(JjimMapper.class);
}
