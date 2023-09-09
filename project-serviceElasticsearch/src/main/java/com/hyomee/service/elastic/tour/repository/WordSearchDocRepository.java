package com.hyomee.service.elastic.tour.repository;

import com.hyomee.service.elastic.tour.doc.WordSearchDoc;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordSearchDocRepository extends ElasticsearchRepository<WordSearchDoc, String> {


}
