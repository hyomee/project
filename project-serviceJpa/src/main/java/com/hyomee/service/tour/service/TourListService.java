package com.hyomee.service.tour.service;


import com.hyomee.service.tour.dto.TourlistConditionReqDTO;
import com.hyomee.service.tour.dto.TourlistDTO;
import com.hyomee.service.tour.repository.TourlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TourListService {
    private final TourlistRepository tourlistRepository;

    public List<TourlistDTO> findTourlist(TourlistConditionReqDTO tourlistConditionReqDTO) {
        return tourlistRepository.findTourlist(tourlistConditionReqDTO);
    }
}
