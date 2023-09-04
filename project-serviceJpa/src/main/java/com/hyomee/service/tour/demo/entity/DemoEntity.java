package com.hyomee.service.tour.demo.entity;

import com.hyomee.jpa.dto.AuditDTO;
import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;


@Setter
@Getter
@Slf4j
@ToString( callSuper = true )
@Table(name = "TB_DEMO")
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SuperBuilder
public class DemoEntity extends AuditVO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String content;
    private String name;

    @PrePersist
    public void prePersistDemoEntity() {
        log.info("PrePersist: " + this.toString());
    }

    @PostPersist
    public void postPersisttDemoEntity() {
        log.info("PostPersist : " +  this.toString());
    }

    @PreRemove
    public void preRemoveDemoEntity() {
        log.info("PreRemove : " + this.toString());
    }

    @PostRemove
    public void postRemoveDemoEntity() {
        log.info("PostRemove : " + this.toString());
    }

    @PreUpdate
    public void preUpdateDemoEntity() {
        log.info("PreUpdate : " + this.toString());
    }

    @PostUpdate
    public void postUpdateDemoEntity() {
        log.info("PostUpdate : " + this.toString());
    }

    @PostLoad
    public void postLoadDemoEntity() {
        log.info("PostLoad : " + this.toString());
    }
}

