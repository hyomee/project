package com.hyomee.service.elastic.tour.repository;



import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.hyomee.es.dto.SearchResponse.SearchResDTO;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.dto.TourListeReqDTO;
import com.hyomee.service.elastic.tour.mapper.EcMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Repository
public class TourListDocCustomRepositoryImpl implements TourListDocCustomRepository {

     private final ElasticsearchClient ecClient;

     private final String inexName = "tourlist";
     private TourListDoc tourListDoc;

     private final Gson gson;
     private final ObjectMapper objectMapper;

     /**
      * 지정된 index에서 match 쿼리를 실행 함
      * @return
      */
     @SneakyThrows
     @Override
     public <T> SearchResDTO getQueryMatch(TourListeReqDTO tourListeReqDTO, T target   )   {

          SearchResponse<Map> searchResponse = ecClient.search(s -> s
                          .index(inexName)
                          .query(q -> q
                                  .match(t -> t
                                          .field(tourListeReqDTO.getSearchField())
                                          .query(tourListeReqDTO.getSearchValue())
                                  )
                          ),
                  Map.class
          );

          return SearchResDTO.initSearchResDTO(searchResponse, target);
     }


}
