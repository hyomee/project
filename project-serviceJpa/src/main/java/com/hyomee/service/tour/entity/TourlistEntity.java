package com.hyomee.service.tour.entity;

import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.ColumnDefault;


@Table(name = "TB_TOURLIST")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class TourlistEntity extends AuditVO {
    @Id
    @Column(length = 20)
    private String contentid;

    @Column(length = 32)
    private String contenttypeid;

    @Column(length = 8)
    private String cat1;

    @Column(length = 16)
    private String cat2;

    @Column(length = 32)
    private String cat3;

    @Column(length = 500)
    private String title;

    @Column(length = 10)
    private String zipcode;

    @Column(length = 1000)
    private String addr;

    @Column(length = 1000)
    private String addr2;

    @Column(length = 100)
    private String tel;

    @Column(length = 5)
    private String areacode;

    @Column(length = 5)
    private String sigungucode;

    @Column(length = 500)
    private String firstimage;

    @Column(length = 500)
    private String firstimage2;

    @Column(length = 65535)
    private String overview;

    @Column(length = 20)
    private String mapx;

    @Column(length = 20)
    private String mapy;

    // 추천 수
    @Column(length = 10)
    @ColumnDefault("0")
    private int recommendCount;

    // 사용자가 선택 한 관광지
    @Column(length = 10)
    @ColumnDefault("0")
    private int addCount;


}