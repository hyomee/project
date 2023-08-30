package com.hyomee.service.elastic.tour.mapper;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.dto.TourListEcTmpDTO;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EcMapper {

    EcMapper INSTANCE = Mappers.getMapper(EcMapper.class);

    List<TourListDoc> toTourListDOCs(List<TourListEcDTO> tourListEcDTOs) ;

    List<TourListDoc> toTourListDocFromTmps(List<TourListEcTmpDTO> tourListEcTmpDTOs) ;
    List<TourListEcDTO> toTourListEcDTOFromTmps(List<TourListEcTmpDTO> tourListEcTmpDTOs) ;

    List<TourListEcDTO> toTourListEcDTOs(List<TourListDoc> tourListDoc) ;

}
