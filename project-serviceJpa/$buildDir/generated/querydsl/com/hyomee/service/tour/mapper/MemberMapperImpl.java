package com.hyomee.service.tour.mapper;

import com.hyomee.service.tour.dto.MemberDTO;
import com.hyomee.service.tour.entity.MemberEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T14:54:40+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.8 (Microsoft)"
)
public class MemberMapperImpl implements MemberMapper {

    @Override
    public MemberDTO toDTO(MemberEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MemberDTO.MemberDTOBuilder memberDTO = MemberDTO.builder();

        memberDTO.memberNo( entity.getMemberNo() );
        memberDTO.memberId( entity.getMemberId() );
        memberDTO.name( entity.getName() );
        memberDTO.pwd( entity.getPwd() );
        memberDTO.birth( entity.getBirth() );
        memberDTO.gender( entity.getGender() );
        memberDTO.phone( entity.getPhone() );
        memberDTO.email( entity.getEmail() );

        return memberDTO.build();
    }

    @Override
    public List<MemberDTO> toDTOs(List<MemberEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MemberDTO> list = new ArrayList<MemberDTO>( entities.size() );
        for ( MemberEntity memberEntity : entities ) {
            list.add( toDTO( memberEntity ) );
        }

        return list;
    }

    @Override
    public MemberEntity toEntity(MemberDTO dto) {
        if ( dto == null ) {
            return null;
        }

        MemberEntity.MemberEntityBuilder memberEntity = MemberEntity.builder();

        memberEntity.memberNo( dto.getMemberNo() );
        memberEntity.memberId( dto.getMemberId() );
        memberEntity.name( dto.getName() );
        memberEntity.pwd( dto.getPwd() );
        memberEntity.birth( dto.getBirth() );
        memberEntity.gender( dto.getGender() );
        memberEntity.phone( dto.getPhone() );
        memberEntity.email( dto.getEmail() );

        return memberEntity.build();
    }

    @Override
    public List<MemberEntity> toEntities(List<MemberDTO> DTOs) {
        if ( DTOs == null ) {
            return null;
        }

        List<MemberEntity> list = new ArrayList<MemberEntity>( DTOs.size() );
        for ( MemberDTO memberDTO : DTOs ) {
            list.add( toEntity( memberDTO ) );
        }

        return list;
    }
}
