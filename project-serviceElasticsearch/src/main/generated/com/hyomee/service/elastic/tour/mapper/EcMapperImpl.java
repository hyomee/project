package com.hyomee.service.elastic.tour.mapper;

import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-30T16:52:28+0900",
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

    @Override
    public List<TourListEcDTO> toTourListEcDTOs(List<TourListDoc> tourListDoc) {
        if ( tourListDoc == null ) {
            return null;
        }

        List<TourListEcDTO> list = new ArrayList<TourListEcDTO>( tourListDoc.size() );
        for ( TourListDoc tourListDoc1 : tourListDoc ) {
            list.add( tourListDocToTourListEcDTO( tourListDoc1 ) );
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

    protected TourListEcDTO tourListDocToTourListEcDTO(TourListDoc tourListDoc) {
        if ( tourListDoc == null ) {
            return null;
        }

        TourListEcDTO.TourListEcDTOBuilder tourListEcDTO = TourListEcDTO.builder();

        tourListEcDTO.tourListId( tourListDoc.getTourListId() );
        tourListEcDTO.contentid( tourListDoc.getContentid() );
        tourListEcDTO.addr1( tourListDoc.getAddr1() );
        tourListEcDTO.addr2( tourListDoc.getAddr2() );
        tourListEcDTO.areacode( tourListDoc.getAreacode() );
        tourListEcDTO.booktour( tourListDoc.getBooktour() );
        tourListEcDTO.cat1( tourListDoc.getCat1() );
        tourListEcDTO.cat2( tourListDoc.getCat2() );
        tourListEcDTO.cat3( tourListDoc.getCat3() );
        tourListEcDTO.contenttypeid( tourListDoc.getContenttypeid() );
        tourListEcDTO.createdtime( tourListDoc.getCreatedtime() );
        tourListEcDTO.firstimage( tourListDoc.getFirstimage() );
        tourListEcDTO.firstimage2( tourListDoc.getFirstimage2() );
        tourListEcDTO.cpyrhtDivCd( tourListDoc.getCpyrhtDivCd() );
        tourListEcDTO.mapx( tourListDoc.getMapx() );
        tourListEcDTO.mapy( tourListDoc.getMapy() );
        tourListEcDTO.mlevel( tourListDoc.getMlevel() );
        tourListEcDTO.modifiedtime( tourListDoc.getModifiedtime() );
        tourListEcDTO.sigungucode( tourListDoc.getSigungucode() );
        tourListEcDTO.tel( tourListDoc.getTel() );
        tourListEcDTO.title( tourListDoc.getTitle() );
        tourListEcDTO.zipcode( tourListDoc.getZipcode() );
        tourListEcDTO.contentid2( tourListDoc.getContentid2() );
        tourListEcDTO.overview( tourListDoc.getOverview() );

        return tourListEcDTO.build();
    }
}
