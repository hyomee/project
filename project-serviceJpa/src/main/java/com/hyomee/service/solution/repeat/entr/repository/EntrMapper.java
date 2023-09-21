package com.hyomee.service.solution.repeat.entr.repository;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.solution.repeat.entr.dto.EntrDTO;
import com.hyomee.service.solution.repeat.entr.entity.EntrEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface EntrMapper extends StructMapper<EntrDTO, EntrEntity> {

    EntrMapper INSTANCE = Mappers.getMapper(EntrMapper.class);
}



