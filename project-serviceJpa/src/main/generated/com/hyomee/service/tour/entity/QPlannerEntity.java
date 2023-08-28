package com.hyomee.service.tour.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlannerEntity is a Querydsl query type for PlannerEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlannerEntity extends EntityPathBase<PlannerEntity> {

    private static final long serialVersionUID = -801838987L;

    public static final QPlannerEntity plannerEntity = new QPlannerEntity("plannerEntity");

    public final StringPath edate = createString("edate");

    public final StringPath memberId = createString("memberId");

    public final StringPath planNo = createString("planNo");

    public final DateTimePath<java.time.LocalDateTime> regdate = createDateTime("regdate", java.time.LocalDateTime.class);

    public final StringPath region = createString("region");

    public final StringPath sdate = createString("sdate");

    public QPlannerEntity(String variable) {
        super(PlannerEntity.class, forVariable(variable));
    }

    public QPlannerEntity(Path<? extends PlannerEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlannerEntity(PathMetadata metadata) {
        super(PlannerEntity.class, metadata);
    }

}

