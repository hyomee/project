package com.hyomee.service.tour.mapper;

import com.hyomee.service.tour.dto.JjimDTO;
import com.hyomee.service.tour.entity.JjimEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T14:54:41+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.8 (Microsoft)"
)
public class JjimMapperImpl implements JjimMapper {

    @Override
    public JjimDTO toDTO(JjimEntity entity) {
        if ( entity == null ) {
            return null;
        }

        JjimDTO.JjimDTOBuilder jjimDTO = JjimDTO.builder();

        jjimDTO.jjimNo( entity.getJjimNo() );
        jjimDTO.memberNo( entity.getMemberNo() );
        jjimDTO.recommend_contentid( entity.getRecommend_contentid() );
        jjimDTO.add_contentid( entity.getAdd_contentid() );

        return jjimDTO.build();
    }

    @Override
    public List<JjimDTO> toDTOs(List<JjimEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<JjimDTO> list = new ArrayList<JjimDTO>( entities.size() );
        for ( JjimEntity jjimEntity : entities ) {
            list.add( toDTO( jjimEntity ) );
        }

        return list;
    }

    @Override
    public JjimEntity toEntity(JjimDTO dto) {
        if ( dto == null ) {
            return null;
        }

        JjimEntity.JjimEntityBuilder jjimEntity = JjimEntity.builder();

        jjimEntity.jjimNo( dto.getJjimNo() );
        jjimEntity.memberNo( dto.getMemberNo() );
        jjimEntity.recommend_contentid( dto.getRecommend_contentid() );
        jjimEntity.add_contentid( dto.getAdd_contentid() );

        return jjimEntity.build();
    }

    @Override
    public List<JjimEntity> toEntities(List<JjimDTO> DTOs) {
        if ( DTOs == null ) {
            return null;
        }

        List<JjimEntity> list = new ArrayList<JjimEntity>( DTOs.size() );
        for ( JjimDTO jjimDTO : DTOs ) {
            list.add( toEntity( jjimDTO ) );
        }

        return list;
    }
}
