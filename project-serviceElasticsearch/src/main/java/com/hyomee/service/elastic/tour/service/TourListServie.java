package com.hyomee.service.elastic.tour.service;

import com.hyomee.core.utils.UuidUtils;
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
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.stereotype.Service;

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

    public boolean updateCount() {
        updateTourListIdRecommendCount();
        updateTourListIdAddCount();
        return true;
    }

    private void updateTourListIdRecommendCount() {
        int tourListIdRecommendCount = UuidUtils.getRandom(7306, 1);
        Optional<TourListDoc> tourListDocOp = tourListDocRepository.findById(String.valueOf(tourListIdRecommendCount));

        if (tourListDocOp.isPresent())  {

            TourListDoc tourListDoc = tourListDocOp.get();
            log.debug("RecommendCount 이전 : " + tourListDoc.getRecommendCount());
            tourListDoc.setRecommendCount(tourListDoc.getRecommendCount()+10);
            log.debug("RecommendCount 이후 : " + tourListDoc.getRecommendCount());
            tourListDocRepository.save(tourListDoc);
        }

    }

    private void updateTourListIdAddCount() {
        int tourListIdRecommendCount = UuidUtils.getRandom(7306, 1);
        Optional<TourListDoc> tourListDocOp = tourListDocRepository.findById(String.valueOf(tourListIdRecommendCount));

        if (tourListDocOp.isPresent())  {
            TourListDoc tourListDoc = tourListDocOp.get();
            log.debug("addCount 이전 : " + tourListDoc.getAddCount());
            tourListDoc.setAddCount(tourListDoc.getAddCount() + 10);
            log.debug("addCount 이후 : " + tourListDoc.getAddCount());
            tourListDocRepository.save(tourListDoc);
        }

    }


    public ResponsePageDTO findByOrderByRecommendCountDesc() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByOrderByRecommendCountDesc(pageable);
        return  ResponsePageDTO.setResponsePageDTO(tourListDocPage);
    }
    public ResponsePageDTO findByOrderByAddCountDesc() {
        Pageable pageable = PageRequest.of(0, 5);
        Page<TourListDoc> tourListDocPage = tourListDocRepository.findByOrderByAddCountDesc(pageable);
        return  ResponsePageDTO.setResponsePageDTO(tourListDocPage);
    }


}
