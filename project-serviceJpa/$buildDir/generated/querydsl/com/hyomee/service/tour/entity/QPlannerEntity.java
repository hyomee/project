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

    public final com.hyomee.jpa.entity.QAuditVO _super = new com.hyomee.jpa.entity.QAuditVO(this);

    public final StringPath endDate = createString("endDate");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> localDateTime = _super.localDateTime;

    public final StringPath memberId = createString("memberId");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath plannerNo = createString("plannerNo");

    public final StringPath region = createString("region");

    public final StringPath startDate = createString("startDate");

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

