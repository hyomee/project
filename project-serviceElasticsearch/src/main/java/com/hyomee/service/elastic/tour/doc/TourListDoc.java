package com.hyomee.service.elastic.tour.doc;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "tourlist")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class TourListDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String tourListId;

    @Field(type = FieldType.Text)
    private String contentid;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String addr1;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String addr2;
    @Field(type = FieldType.Integer )
    private int areacode;
    @Field(type = FieldType.Integer )
    private int booktour;
    private String cat1;
    private String cat2;
    private String cat3;
    private String contenttypeid;
    private String createdtime;
    private String firstimage;
    private String firstimage2;
    private String cpyrhtDivCd;
    private String mapx;
    private String mapy;
    @Field(type = FieldType.Integer )
    private int mlevel;
    private String modifiedtime;
    private String sigungucode;
    private String tel;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String title;

    private String zipcode;
    private String contentid2;

    @Field(type = FieldType.Text, analyzer = "nori")
    private String overview;
}
