package com.hyomee.service.elastic.tour.repository;


import com.hyomee.service.elastic.tour.doc.TourListDoc;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Highlight;
import org.springframework.data.elasticsearch.annotations.HighlightField;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TourListDocRepository extends ElasticsearchRepository<TourListDoc, String> , TourListDocCustomRepository{

    List<TourListDoc> findByTitle(String title);
    Page<TourListDoc> findByTitle(String title, Pageable pageable);

    List<TourListDoc> findByOverview(String overview);


    Page<TourListDoc> findByOverview(String overview, Pageable pageable);

    @Highlight(fields = {
            @HighlightField(name = "overview"),
            @HighlightField(name = "title")
    })
    Page<SearchHit<TourListDoc>> findHitsByOverview(String overview, Pageable pageable);


    Page<TourListDoc> findByOrderByRecommendCountDesc(Pageable pageable);

    Page<TourListDoc> findByOrderByAddCountDesc(Pageable pageable);
}
