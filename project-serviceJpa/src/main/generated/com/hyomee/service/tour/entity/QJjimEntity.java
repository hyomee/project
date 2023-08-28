package com.hyomee.service.tour.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QJjimEntity is a Querydsl query type for JjimEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QJjimEntity extends EntityPathBase<JjimEntity> {

    private static final long serialVersionUID = 806115143L;

    public static final QJjimEntity jjimEntity = new QJjimEntity("jjimEntity");

    public final NumberPath<Integer> addno = createNumber("addno", Integer.class);

    public final StringPath jjimId = createString("jjimId");

    public final StringPath memberId = createString("memberId");

    public final NumberPath<Integer> recommendno = createNumber("recommendno", Integer.class);

    public QJjimEntity(String variable) {
        super(JjimEntity.class, forVariable(variable));
    }

    public QJjimEntity(Path<? extends JjimEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QJjimEntity(PathMetadata metadata) {
        super(JjimEntity.class, metadata);
    }

}

