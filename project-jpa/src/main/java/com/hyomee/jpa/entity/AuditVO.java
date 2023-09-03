package com.hyomee.jpa.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hyomee.core.utils.DateTimeUtils;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

/*
    이 class클 Entity에서 상속받으면
    생성시간과 수정시간이 자동으로 Table 에 추가된다
*/
@Setter
@Getter
@ToString()
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AuditVO {
    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createDateTime;

    @LastModifiedDate
    private LocalDateTime updateDataTime;


//    @PrePersist
//    public void prePersistAuditVO() {
//        if (this.createDateTime == null){
//            this.createDateTime = DateTimeUtils.getCurrentDateTime();
//        }
//
//        this.updateDataTime = DateTimeUtils.getCurrentDateTime();
//    }
////
////    @PostPersist
////    public void postPersistAuditVO() {
////        this.createDateTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
////        this.updateDataTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
////    }
////
////    @PostLoad
////    public void postLoadAuditVO() {
////        this.createDateTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
////        this.updateDataTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
////    }
//
//    @PreUpdate
//    public void preUpdateAuditVO() {
//        if (this.createDateTime != null) {
//            this.createDateTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
//        }
//
//        if (this.createDateTime == null) {
//            this.updateDataTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
//        }
//    }
//
//    @PostUpdate
//    public void postUpdateAuditVO() {
//        this.createDateTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
//        this.updateDataTime = DateTimeUtils.convertTypeCurrentDateTime(this.createDateTime);
//    }
}