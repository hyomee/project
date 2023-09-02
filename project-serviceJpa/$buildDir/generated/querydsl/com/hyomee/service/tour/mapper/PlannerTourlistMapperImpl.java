package com.hyomee.service.tour.mapper;

import com.hyomee.service.tour.dto.PlannerTourlistDTO;
import com.hyomee.service.tour.entity.PlannerTourlistEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T14:54:41+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.8 (Microsoft)"
)
public class PlannerTourlistMapperImpl implements PlannerTourlistMapper {

    @Override
    public PlannerTourlistDTO toDTO(PlannerTourlistEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PlannerTourlistDTO.PlannerTourlistDTOBuilder plannerTourlistDTO = PlannerTourlistDTO.builder();

        plannerTourlistDTO.plannerTourlistNo( entity.getPlannerTourlistNo() );
        plannerTourlistDTO.plannerNo( entity.getPlannerNo() );
        plannerTourlistDTO.contentid( entity.getContentid() );
        plannerTourlistDTO.tourSeq( entity.getTourSeq() );
        plannerTourlistDTO.tourDay( entity.getTourDay() );

        return plannerTourlistDTO.build();
    }

    @Override
    public List<PlannerTourlistDTO> toDTOs(List<PlannerTourlistEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PlannerTourlistDTO> list = new ArrayList<PlannerTourlistDTO>( entities.size() );
        for ( PlannerTourlistEntity plannerTourlistEntity : entities ) {
            list.add( toDTO( plannerTourlistEntity ) );
        }

        return list;
    }

    @Override
    public PlannerTourlistEntity toEntity(PlannerTourlistDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PlannerTourlistEntity.PlannerTourlistEntityBuilder plannerTourlistEntity = PlannerTourlistEntity.builder();

        plannerTourlistEntity.plannerTourlistNo( dto.getPlannerTourlistNo() );
        plannerTourlistEntity.plannerNo( dto.getPlannerNo() );
        plannerTourlistEntity.contentid( dto.getContentid() );
        plannerTourlistEntity.tourSeq( dto.getTourSeq() );
        plannerTourlistEntity.tourDay( dto.getTourDay() );

        return plannerTourlistEntity.build();
    }

    @Override
    public List<PlannerTourlistEntity> toEntities(List<PlannerTourlistDTO> DTOs) {
        if ( DTOs == null ) {
            return null;
        }

        List<PlannerTourlistEntity> list = new ArrayList<PlannerTourlistEntity>( DTOs.size() );
        for ( PlannerTourlistDTO plannerTourlistDTO : DTOs ) {
            list.add( toEntity( plannerTourlistDTO ) );
        }

        return list;
    }
}
