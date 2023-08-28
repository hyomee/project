package com.hyomee.service.tour.repository;


import com.hyomee.service.tour.dto.TourlistConditionReqDTO;
import com.hyomee.service.tour.dto.TourlistDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TourlistCustomRespository {
    List<TourlistDTO> findTourlist(TourlistConditionReqDTO tourlistConditionReqDTO);
    Page<TourlistDTO> findTourlistPage(TourlistConditionReqDTO tourlistConditionReqDTO,
                                       Pageable pageable);
    Page<TourlistDTO> findTourlistPageComplex(TourlistConditionReqDTO tourlistConditionReqDTO, Pageable pageable);
}
