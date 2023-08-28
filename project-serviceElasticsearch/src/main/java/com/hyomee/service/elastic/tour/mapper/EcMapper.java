package com.hyomee.service.elastic.tour.mapper;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EcMapper {

    EcMapper INSTANCE = Mappers.getMapper(EcMapper.class);

    List<TourListDoc> toTourListDOCs(List<TourListEcDTO> tourListEcDTOs) ;
}
