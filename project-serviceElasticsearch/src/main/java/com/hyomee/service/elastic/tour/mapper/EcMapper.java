package com.hyomee.service.elastic.tour.mapper;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper
public interface EcMapper {

    EcMapper INSTANCE = Mappers.getMapper(EcMapper.class);

    List<TourListDoc> toTourListDOCs(List<TourListEcDTO> tourListEcDTOs) ;
    List<TourListEcDTO> toTourListEcDTOs(List<TourListDoc> tourListDoc) ;

}
