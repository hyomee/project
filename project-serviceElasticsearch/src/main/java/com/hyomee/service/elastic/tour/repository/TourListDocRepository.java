package com.hyomee.service.elastic.tour.repository;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TourListDocRepository extends ElasticsearchRepository<TourListDoc, String> {

    List<TourListDoc> findByTitle(String title);


    Optional<TourListDoc> findByOverview(String overview);

}
