package com.hyomee.service.elastic.tour.repository;

import co.elastic.clients.elasticsearch._types.aggregations.GlobalAggregate;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import com.hyomee.es.dto.SearchResponse.SearchResDTO;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListeReqDTO;

import java.util.Map;

public interface TourListDocCustomRepository {

    <T> SearchResDTO getQueryMatch(TourListeReqDTO tourListeReqDTO, T t );

}
