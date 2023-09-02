package com.hyomee.service.tour.mapper;

import com.hyomee.service.tour.dto.TourlistDTO;
import com.hyomee.service.tour.entity.TourlistEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-02T14:54:41+0900",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-8.2.jar, environment: Java 17.0.8 (Microsoft)"
)
public class TourlistMapperImpl implements TourlistMapper {

    @Override
    public TourlistDTO toDTO(TourlistEntity entity) {
        if ( entity == null ) {
            return null;
        }

        TourlistDTO.TourlistDTOBuilder tourlistDTO = TourlistDTO.builder();

        tourlistDTO.contentid( entity.getContentid() );
        tourlistDTO.contenttypeid( entity.getContenttypeid() );
        tourlistDTO.cat1( entity.getCat1() );
        tourlistDTO.cat2( entity.getCat2() );
        tourlistDTO.cat3( entity.getCat3() );
        tourlistDTO.title( entity.getTitle() );
        tourlistDTO.zipcode( entity.getZipcode() );
        tourlistDTO.addr( entity.getAddr() );
        tourlistDTO.addr2( entity.getAddr2() );
        tourlistDTO.tel( entity.getTel() );
        tourlistDTO.areacode( entity.getAreacode() );
        tourlistDTO.sigungucode( entity.getSigungucode() );
        tourlistDTO.firstimage( entity.getFirstimage() );
        tourlistDTO.firstimage2( entity.getFirstimage2() );
        tourlistDTO.overview( entity.getOverview() );
        tourlistDTO.mapx( entity.getMapx() );
        tourlistDTO.mapy( entity.getMapy() );
        tourlistDTO.recommendCount( entity.getRecommendCount() );

        return tourlistDTO.build();
    }

    @Override
    public List<TourlistDTO> toDTOs(List<TourlistEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TourlistDTO> list = new ArrayList<TourlistDTO>( entities.size() );
        for ( TourlistEntity tourlistEntity : entities ) {
            list.add( toDTO( tourlistEntity ) );
        }

        return list;
    }

    @Override
    public TourlistEntity toEntity(TourlistDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TourlistEntity.TourlistEntityBuilder tourlistEntity = TourlistEntity.builder();

        tourlistEntity.contentid( dto.getContentid() );
        tourlistEntity.contenttypeid( dto.getContenttypeid() );
        tourlistEntity.cat1( dto.getCat1() );
        tourlistEntity.cat2( dto.getCat2() );
        tourlistEntity.cat3( dto.getCat3() );
        tourlistEntity.title( dto.getTitle() );
        tourlistEntity.zipcode( dto.getZipcode() );
        tourlistEntity.addr( dto.getAddr() );
        tourlistEntity.addr2( dto.getAddr2() );
        tourlistEntity.tel( dto.getTel() );
        tourlistEntity.areacode( dto.getAreacode() );
        tourlistEntity.sigungucode( dto.getSigungucode() );
        tourlistEntity.firstimage( dto.getFirstimage() );
        tourlistEntity.firstimage2( dto.getFirstimage2() );
        tourlistEntity.overview( dto.getOverview() );
        tourlistEntity.mapx( dto.getMapx() );
        tourlistEntity.mapy( dto.getMapy() );
        tourlistEntity.recommendCount( dto.getRecommendCount() );

        return tourlistEntity.build();
    }

    @Override
    public List<TourlistEntity> toEntities(List<TourlistDTO> DTOs) {
        if ( DTOs == null ) {
            return null;
        }

        List<TourlistEntity> list = new ArrayList<TourlistEntity>( DTOs.size() );
        for ( TourlistDTO tourlistDTO : DTOs ) {
            list.add( toEntity( tourlistDTO ) );
        }

        return list;
    }
}
