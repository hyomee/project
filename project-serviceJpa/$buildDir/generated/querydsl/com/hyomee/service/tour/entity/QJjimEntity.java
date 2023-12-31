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

    public final com.hyomee.jpa.entity.QAuditVO _super = new com.hyomee.jpa.entity.QAuditVO(this);

    public final StringPath add_contentid = createString("add_contentid");

    public final StringPath jjimNo = createString("jjimNo");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> localDateTime = _super.localDateTime;

    public final StringPath memberNo = createString("memberNo");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath recommend_contentid = createString("recommend_contentid");

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

