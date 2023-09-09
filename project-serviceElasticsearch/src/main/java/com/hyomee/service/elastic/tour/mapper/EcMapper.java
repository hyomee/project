package com.hyomee.service.elastic.tour.mapper;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.doc.WordSearchDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.dto.WordSearchDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface EcMapper {

    EcMapper INSTANCE = Mappers.getMapper(EcMapper.class);

    TourListEcDTO  toTourListEcDTO(TourListDoc tourListDoc) ;
    List<TourListDoc> toTourListDOCs(List<TourListEcDTO> tourListEcDTOs) ;


    List<TourListEcDTO> toTourListEcDTOs(List<TourListDoc> tourListDoc) ;


    List<WordSearchDTO> toWordSearchDTOs(List<WordSearchDoc> wordSearchDocs) ;
    List<WordSearchDoc> toWordSearchDocs(List<WordSearchDTO> wordSearchDTOs) ;

    WordSearchDTO toWordSearchDTO(WordSearchDoc wordSearchDoc) ;
    WordSearchDoc toWordSearchDoc(WordSearchDTO wordSearchDTO) ;

}
