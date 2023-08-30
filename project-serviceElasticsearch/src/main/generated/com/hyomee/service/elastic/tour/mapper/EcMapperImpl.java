package com.hyomee.service.elastic.tour.mapper;

import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.dto.TourListEcTmpDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-31T00:23:12+0900",
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
    public List<TourListDoc> toTourListDocFromTmps(List<TourListEcTmpDTO> tourListEcTmpDTOs) {
        if ( tourListEcTmpDTOs == null ) {
            return null;
        }

        List<TourListDoc> list = new ArrayList<TourListDoc>( tourListEcTmpDTOs.size() );
        for ( TourListEcTmpDTO tourListEcTmpDTO : tourListEcTmpDTOs ) {
            list.add( tourListEcTmpDTOToTourListDoc( tourListEcTmpDTO ) );
        }

        return list;
    }

    @Override
    public List<TourListEcDTO> toTourListEcDTOFromTmps(List<TourListEcTmpDTO> tourListEcTmpDTOs) {
        if ( tourListEcTmpDTOs == null ) {
            return null;
        }

        List<TourListEcDTO> list = new ArrayList<TourListEcDTO>( tourListEcTmpDTOs.size() );
        for ( TourListEcTmpDTO tourListEcTmpDTO : tourListEcTmpDTOs ) {
            list.add( tourListEcTmpDTOToTourListEcDTO( tourListEcTmpDTO ) );
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

    protected TourListDoc tourListEcTmpDTOToTourListDoc(TourListEcTmpDTO tourListEcTmpDTO) {
        if ( tourListEcTmpDTO == null ) {
            return null;
        }

        TourListDoc.TourListDocBuilder tourListDoc = TourListDoc.builder();

        tourListDoc.tourListId( tourListEcTmpDTO.getTourListId() );
        tourListDoc.contentid( tourListEcTmpDTO.getContentid() );
        tourListDoc.addr1( tourListEcTmpDTO.getAddr1() );
        tourListDoc.addr2( tourListEcTmpDTO.getAddr2() );
        if ( tourListEcTmpDTO.getAreacode() != null ) {
            tourListDoc.areacode( Integer.parseInt( tourListEcTmpDTO.getAreacode() ) );
        }
        if ( tourListEcTmpDTO.getBooktour() != null ) {
            tourListDoc.booktour( Integer.parseInt( tourListEcTmpDTO.getBooktour() ) );
        }
        tourListDoc.cat1( tourListEcTmpDTO.getCat1() );
        tourListDoc.cat2( tourListEcTmpDTO.getCat2() );
        tourListDoc.cat3( tourListEcTmpDTO.getCat3() );
        tourListDoc.contenttypeid( tourListEcTmpDTO.getContenttypeid() );
        tourListDoc.createdtime( tourListEcTmpDTO.getCreatedtime() );
        tourListDoc.firstimage( tourListEcTmpDTO.getFirstimage() );
        tourListDoc.firstimage2( tourListEcTmpDTO.getFirstimage2() );
        tourListDoc.cpyrhtDivCd( tourListEcTmpDTO.getCpyrhtDivCd() );
        tourListDoc.mapx( tourListEcTmpDTO.getMapx() );
        tourListDoc.mapy( tourListEcTmpDTO.getMapy() );
        if ( tourListEcTmpDTO.getMlevel() != null ) {
            tourListDoc.mlevel( Integer.parseInt( tourListEcTmpDTO.getMlevel() ) );
        }
        tourListDoc.modifiedtime( tourListEcTmpDTO.getModifiedtime() );
        tourListDoc.sigungucode( tourListEcTmpDTO.getSigungucode() );
        tourListDoc.tel( tourListEcTmpDTO.getTel() );
        tourListDoc.title( tourListEcTmpDTO.getTitle() );
        tourListDoc.zipcode( tourListEcTmpDTO.getZipcode() );
        tourListDoc.contentid2( tourListEcTmpDTO.getContentid2() );
        tourListDoc.overview( tourListEcTmpDTO.getOverview() );

        return tourListDoc.build();
    }

    protected TourListEcDTO tourListEcTmpDTOToTourListEcDTO(TourListEcTmpDTO tourListEcTmpDTO) {
        if ( tourListEcTmpDTO == null ) {
            return null;
        }

        TourListEcDTO.TourListEcDTOBuilder tourListEcDTO = TourListEcDTO.builder();

        tourListEcDTO.tourListId( tourListEcTmpDTO.getTourListId() );
        tourListEcDTO.contentid( tourListEcTmpDTO.getContentid() );
        tourListEcDTO.addr1( tourListEcTmpDTO.getAddr1() );
        tourListEcDTO.addr2( tourListEcTmpDTO.getAddr2() );
        if ( tourListEcTmpDTO.getAreacode() != null ) {
            tourListEcDTO.areacode( Integer.parseInt( tourListEcTmpDTO.getAreacode() ) );
        }
        if ( tourListEcTmpDTO.getBooktour() != null ) {
            tourListEcDTO.booktour( Integer.parseInt( tourListEcTmpDTO.getBooktour() ) );
        }
        tourListEcDTO.cat1( tourListEcTmpDTO.getCat1() );
        tourListEcDTO.cat2( tourListEcTmpDTO.getCat2() );
        tourListEcDTO.cat3( tourListEcTmpDTO.getCat3() );
        tourListEcDTO.contenttypeid( tourListEcTmpDTO.getContenttypeid() );
        tourListEcDTO.createdtime( tourListEcTmpDTO.getCreatedtime() );
        tourListEcDTO.firstimage( tourListEcTmpDTO.getFirstimage() );
        tourListEcDTO.firstimage2( tourListEcTmpDTO.getFirstimage2() );
        tourListEcDTO.cpyrhtDivCd( tourListEcTmpDTO.getCpyrhtDivCd() );
        tourListEcDTO.mapx( tourListEcTmpDTO.getMapx() );
        tourListEcDTO.mapy( tourListEcTmpDTO.getMapy() );
        if ( tourListEcTmpDTO.getMlevel() != null ) {
            tourListEcDTO.mlevel( Integer.parseInt( tourListEcTmpDTO.getMlevel() ) );
        }
        tourListEcDTO.modifiedtime( tourListEcTmpDTO.getModifiedtime() );
        tourListEcDTO.sigungucode( tourListEcTmpDTO.getSigungucode() );
        tourListEcDTO.tel( tourListEcTmpDTO.getTel() );
        tourListEcDTO.title( tourListEcTmpDTO.getTitle() );
        tourListEcDTO.zipcode( tourListEcTmpDTO.getZipcode() );
        tourListEcDTO.contentid2( tourListEcTmpDTO.getContentid2() );
        tourListEcDTO.overview( tourListEcTmpDTO.getOverview() );

        return tourListEcDTO.build();
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
