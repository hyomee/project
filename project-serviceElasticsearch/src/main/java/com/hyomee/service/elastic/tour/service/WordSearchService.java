package com.hyomee.service.elastic.tour.service;


import co.elastic.clients.elasticsearch._types.aggregations.Aggregation;
import co.elastic.clients.elasticsearch._types.aggregations.AggregationBuilders;
import co.elastic.clients.elasticsearch._types.aggregations.HistogramBucket;
import co.elastic.clients.elasticsearch._types.aggregations.StringTermsBucket;
import co.elastic.clients.elasticsearch._types.query_dsl.MatchQuery;
import co.elastic.clients.elasticsearch._types.query_dsl.Query;
import co.elastic.clients.elasticsearch._types.query_dsl.QueryBuilders;
import co.elastic.clients.elasticsearch.core.SearchRequest;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import com.hyomee.es.config.ElasticSearchConfig;
import com.hyomee.service.elastic.tour.doc.WordSearchDoc;
import com.hyomee.service.elastic.tour.dto.WordSearchRspDTO;
import com.hyomee.service.elastic.tour.repository.WordSearchDocRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
@Slf4j
public class WordSearchService  {

    private final WordSearchDocRepository wordSearchDocRepository;
    private final ElasticSearchConfig elasticSearchConfig;

    public boolean saveWordSearch(String words) {
        WordSearchDoc wordSearchDoc = WordSearchDoc.builder()
                        .words(words)
                        .build();
        wordSearchDocRepository.save(wordSearchDoc);
        return true;
    }


    public  List<WordSearchRspDTO> getTopTags(String fieldname, int size) throws IOException {

//        Query query = MatchQuery.of(m -> m
//                .field("words")
//        )._toQuery();

        SearchResponse<Void> response = elasticSearchConfig.getElasticSearchClient().search(b -> b
                        .index("wordsearch")
                        .size(0)
                        .aggregations("top_tags", a -> a
                                .terms(h -> h
                                        .field(fieldname)
                                        .size(size)
                                )
                        ),
                Void.class
        );

        List<WordSearchRspDTO> buckets = response.aggregations()
                .get("top_tags")
                .sterms().buckets().array().stream().map(bucket -> {
                    WordSearchRspDTO wordSearchRspDTO = WordSearchRspDTO.builder()
                            .word(String.valueOf(bucket.key()._get()))
                            .cnt((int) bucket.docCount())
                            .build();
                    return wordSearchRspDTO;

                }).collect(Collectors.toList());

        return buckets;
    }
}

/**
 * TermsAggregationBuilder aggregation = AggregationBuilders.terms("top_tags")
 *   .field("tags")
 *   .order(Terms.Order.count(false));
 * SearchSourceBuilder builder = new SearchSourceBuilder().aggregation(aggregation);
 *
 * SearchRequest searchRequest =
 *   new SearchRequest().indices("blog").types("article").source(builder);
 * SearchResponse response = client.search(searchRequest, RequestOptions.DEFAULT);
 *
 * Map<String, Aggregation> results = response.getAggregations().asMap();
 * StringTerms topTags = (StringTerms) results.get("top_tags");
 *
 * List<String> keys = topTags.getBuckets()
 *   .stream()
 *   .map(b -> b.getKeyAsString())
 *   .collect(toList());
 * assertEquals(asList("elasticsearch", "spring data", "search engines", "tutorial"), keys);
 */