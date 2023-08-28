package com.hyomee.service.tour.repository;

import com.hyomee.service.tour.dto.TourlistDTO;
import com.hyomee.service.tour.entity.TourlistEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-29T01:07:48+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Microsoft)"
)
public class WorkMapperImpl implements WorkMapper {

    @Override
    public TourlistDTO toTourlistDTO(TourlistEntity tourlistEntity) {
        if ( tourlistEntity == null ) {
            return null;
        }

        TourlistDTO.TourlistDTOBuilder tourlistDTO = TourlistDTO.builder();

        tourlistDTO.contentid( tourlistEntity.getContentid() );
        tourlistDTO.title( tourlistEntity.getTitle() );
        tourlistDTO.zipcode( tourlistEntity.getZipcode() );
        tourlistDTO.addr( tourlistEntity.getAddr() );
        tourlistDTO.addr2( tourlistEntity.getAddr2() );
        tourlistDTO.tel( tourlistEntity.getTel() );
        tourlistDTO.areacode( tourlistEntity.getAreacode() );
        tourlistDTO.sigungucode( tourlistEntity.getSigungucode() );
        tourlistDTO.firstimage( tourlistEntity.getFirstimage() );
        tourlistDTO.firstimage2( tourlistEntity.getFirstimage2() );
        tourlistDTO.overview( tourlistEntity.getOverview() );
        tourlistDTO.mapx( tourlistEntity.getMapx() );
        tourlistDTO.mapy( tourlistEntity.getMapy() );

        return tourlistDTO.build();
    }

    @Override
    public List<TourlistDTO> toTourlistDTOs(List<TourlistEntity> tourlistEntity) {
        if ( tourlistEntity == null ) {
            return null;
        }

        List<TourlistDTO> list = new ArrayList<TourlistDTO>( tourlistEntity.size() );
        for ( TourlistEntity tourlistEntity1 : tourlistEntity ) {
            list.add( toTourlistDTO( tourlistEntity1 ) );
        }

        return list;
    }

    @Override
    public TourlistEntity toTourlistEntity(TourlistDTO tourlistDTO) {
        if ( tourlistDTO == null ) {
            return null;
        }

        TourlistEntity tourlistEntity = new TourlistEntity();

        tourlistEntity.setContentid( tourlistDTO.getContentid() );
        tourlistEntity.setTitle( tourlistDTO.getTitle() );
        tourlistEntity.setZipcode( tourlistDTO.getZipcode() );
        tourlistEntity.setAddr( tourlistDTO.getAddr() );
        tourlistEntity.setAddr2( tourlistDTO.getAddr2() );
        tourlistEntity.setTel( tourlistDTO.getTel() );
        tourlistEntity.setAreacode( tourlistDTO.getAreacode() );
        tourlistEntity.setSigungucode( tourlistDTO.getSigungucode() );
        tourlistEntity.setFirstimage( tourlistDTO.getFirstimage() );
        tourlistEntity.setFirstimage2( tourlistDTO.getFirstimage2() );
        tourlistEntity.setOverview( tourlistDTO.getOverview() );
        tourlistEntity.setMapx( tourlistDTO.getMapx() );
        tourlistEntity.setMapy( tourlistDTO.getMapy() );

        return tourlistEntity;
    }

    @Override
    public List<TourlistEntity> toTourlistEntitys(List<TourlistDTO> tourlistDTO) {
        if ( tourlistDTO == null ) {
            return null;
        }

        List<TourlistEntity> list = new ArrayList<TourlistEntity>( tourlistDTO.size() );
        for ( TourlistDTO tourlistDTO1 : tourlistDTO ) {
            list.add( toTourlistEntity( tourlistDTO1 ) );
        }

        return list;
    }
}
