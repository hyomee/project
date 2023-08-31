package com.hyomee.service.elastic.tour.service;

import co.elastic.clients.elasticsearch.core.SearchResponse;
import com.hyomee.es.dto.ResponsePageDTO;
import com.hyomee.es.dto.SearchResponse.SearchResDTO;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.dto.TourListeReqDTO;
import com.hyomee.service.elastic.tour.mapper.EcMapper;
import com.hyomee.service.elastic.tour.repository.TourListDocRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class TourListServie {

    private final TourListDocRepository tourListDocRepository;

    public List<TourListEcDTO> getTourListByTitle(String title) {
        List<TourListDoc>  tourListDocs = tourListDocRepository.findByTitle(title);
        return  EcMapper.INSTANCE.toTourListEcDTOs(tourListDocs);

    }

    public ResponsePageDTO getTourListByTitle(String title, Pageable pageable) {
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByTitle(title, pageable);
        return  ResponsePageDTO.setResponsePageDTO(tourListDocPage);

    }

    public List<TourListEcDTO> getTourListByOverview(String overview) {
        return EcMapper.INSTANCE.toTourListEcDTOs(tourListDocRepository.findByOverview(overview));
    }



    public ResponsePageDTO getTourListByOverview(String overview, Pageable pageable) {
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByOverview(overview, pageable);
        return  ResponsePageDTO.setResponsePageDTO(tourListDocPage);

    }

    public ResponsePageDTO findHitsByOverview(String overview, Pageable pageable) {
        Page<SearchHit<TourListDoc>> tourListDocPage = tourListDocRepository.findHitsByOverview(overview, pageable);
        return ResponsePageDTO.setResponsePageDTO(tourListDocPage);

    }

    public SearchResDTO findTourListDocByMatch(TourListeReqDTO tourListeReqDTO) {
        return tourListDocRepository.getQueryMatch(tourListeReqDTO, TourListEcDTO.class);

    }

}
