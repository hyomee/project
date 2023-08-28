package com.hyomee.service.elastic.tour.repository;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourListDocRepository extends ElasticsearchRepository<TourListDoc, Long> {
}
