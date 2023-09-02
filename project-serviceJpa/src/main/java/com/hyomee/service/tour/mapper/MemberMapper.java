package com.hyomee.service.tour.mapper;


import com.hyomee.core.mapper.StructMapper;
import com.hyomee.service.tour.dto.MemberDTO;
import com.hyomee.service.tour.entity.MemberEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MemberMapper extends StructMapper<MemberDTO, MemberEntity> {
    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);
}
