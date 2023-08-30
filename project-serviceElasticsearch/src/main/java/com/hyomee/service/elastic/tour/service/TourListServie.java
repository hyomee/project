package com.hyomee.service.elastic.tour.service;

import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.mapper.EcMapper;
import com.hyomee.service.elastic.tour.repository.TourListDocRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

    public List<TourListEcDTO> getTourListByTitle(String title, Pageable pageable) {
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByTitle(title, pageable);
        return  EcMapper.INSTANCE.toTourListEcDTOs(tourListDocPage.getContent());

    }

    public List<TourListEcDTO> getTourListByOverview(String overview) {
        return EcMapper.INSTANCE.toTourListEcDTOs(tourListDocRepository.findByOverview(overview));
    }



    public List<TourListEcDTO> getTourListByOverview(String overview, Pageable pageable) {
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByOverview(overview, pageable);
        return  EcMapper.INSTANCE.toTourListEcDTOs(tourListDocPage.getContent());

    }

}
