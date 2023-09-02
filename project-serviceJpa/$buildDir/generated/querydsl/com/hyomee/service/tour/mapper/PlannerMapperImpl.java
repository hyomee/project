package com.hyomee.service.tour.mapper;

import com.hyomee.service.tour.dto.PlannerDTO;
import com.hyomee.service.tour.entity.PlannerEntity;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T14:54:41+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.8 (Microsoft)"
)
public class PlannerMapperImpl implements PlannerMapper {

    @Override
    public PlannerDTO toDTO(PlannerEntity entity) {
        if ( entity == null ) {
            return null;
        }

        PlannerDTO.PlannerDTOBuilder plannerDTO = PlannerDTO.builder();

        plannerDTO.plannerNo( entity.getPlannerNo() );
        plannerDTO.memberId( entity.getMemberId() );
        plannerDTO.region( entity.getRegion() );
        plannerDTO.startDate( entity.getStartDate() );
        plannerDTO.endDate( entity.getEndDate() );
        if ( entity.getLocalDateTime() != null ) {
            plannerDTO.localDateTime( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( entity.getLocalDateTime() ) );
        }

        return plannerDTO.build();
    }

    @Override
    public List<PlannerDTO> toDTOs(List<PlannerEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PlannerDTO> list = new ArrayList<PlannerDTO>( entities.size() );
        for ( PlannerEntity plannerEntity : entities ) {
            list.add( toDTO( plannerEntity ) );
        }

        return list;
    }

    @Override
    public PlannerEntity toEntity(PlannerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PlannerEntity.PlannerEntityBuilder plannerEntity = PlannerEntity.builder();

        plannerEntity.plannerNo( dto.getPlannerNo() );
        plannerEntity.memberId( dto.getMemberId() );
        plannerEntity.region( dto.getRegion() );
        plannerEntity.startDate( dto.getStartDate() );
        plannerEntity.endDate( dto.getEndDate() );

        return plannerEntity.build();
    }

    @Override
    public List<PlannerEntity> toEntities(List<PlannerDTO> DTOs) {
        if ( DTOs == null ) {
            return null;
        }

        List<PlannerEntity> list = new ArrayList<PlannerEntity>( DTOs.size() );
        for ( PlannerDTO plannerDTO : DTOs ) {
            list.add( toEntity( plannerDTO ) );
        }

        return list;
    }
}
