package com.hyomee.service.elastic.tour.mapper;

import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-29T23:05:32+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Microsoft)"
)
public class EcMapperImpl implements EcMapper {

    @Override
    public List<TourListDoc> toTourListDOCs(List<TourListEcDTO> tourListEcDTOs) {
        if ( tourListEcDTOs == null ) {
            return null;
        }

        List<TourListDoc> list = new ArrayList<TourListDoc>( tourListEcDTOs.size() );
        for ( TourListEcDTO tourListEcDTO : tourListEcDTOs ) {
            list.add( tourListEcDTOToTourListDoc( tourListEcDTO ) );
        }

        return list;
    }

    protected TourListDoc tourListEcDTOToTourListDoc(TourListEcDTO tourListEcDTO) {
        if ( tourListEcDTO == null ) {
            return null;
        }

        TourListDoc.TourListDocBuilder tourListDoc = TourListDoc.builder();

        tourListDoc.tourListId( tourListEcDTO.getTourListId() );
        tourListDoc.contentid( tourListEcDTO.getContentid() );
        tourListDoc.addr1( tourListEcDTO.getAddr1() );
        tourListDoc.addr2( tourListEcDTO.getAddr2() );
        tourListDoc.areacode( tourListEcDTO.getAreacode() );
        tourListDoc.booktour( tourListEcDTO.getBooktour() );
        tourListDoc.cat1( tourListEcDTO.getCat1() );
        tourListDoc.cat2( tourListEcDTO.getCat2() );
        tourListDoc.cat3( tourListEcDTO.getCat3() );
        tourListDoc.contenttypeid( tourListEcDTO.getContenttypeid() );
        tourListDoc.createdtime( tourListEcDTO.getCreatedtime() );
        tourListDoc.firstimage( tourListEcDTO.getFirstimage() );
        tourListDoc.firstimage2( tourListEcDTO.getFirstimage2() );
        tourListDoc.cpyrhtDivCd( tourListEcDTO.getCpyrhtDivCd() );
        tourListDoc.mapx( tourListEcDTO.getMapx() );
        tourListDoc.mapy( tourListEcDTO.getMapy() );
        tourListDoc.mlevel( tourListEcDTO.getMlevel() );
        tourListDoc.modifiedtime( tourListEcDTO.getModifiedtime() );
        tourListDoc.sigungucode( tourListEcDTO.getSigungucode() );
        tourListDoc.tel( tourListEcDTO.getTel() );
        tourListDoc.title( tourListEcDTO.getTitle() );
        tourListDoc.zipcode( tourListEcDTO.getZipcode() );
        tourListDoc.contentid2( tourListEcDTO.getContentid2() );
        tourListDoc.overview( tourListEcDTO.getOverview() );

        return tourListDoc.build();
    }
}
