package com.hyomee.service.tour.demo.entity;

import com.hyomee.jpa.entity.AuditVO;
import com.hyomee.jpa.event.EntityEventCallListener;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
@Table(name = "TB_EVENT_DEMO")
@EntityListeners(EntityEventCallListener.class)
@Entity
@SuperBuilder
public class DemoEventEntity extends AuditVO {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String title;
    private String content;
    private String name;
}

