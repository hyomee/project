package com.hyomee.service.tour.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPlannerTourlistEntity is a Querydsl query type for PlannerTourlistEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPlannerTourlistEntity extends EntityPathBase<PlannerTourlistEntity> {

    private static final long serialVersionUID = -902053621L;

    public static final QPlannerTourlistEntity plannerTourlistEntity = new QPlannerTourlistEntity("plannerTourlistEntity");

    public final com.hyomee.jpa.entity.QAuditVO _super = new com.hyomee.jpa.entity.QAuditVO(this);

    public final StringPath contentid = createString("contentid");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> localDateTime = _super.localDateTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath plannerNo = createString("plannerNo");

    public final StringPath plannerTourlistNo = createString("plannerTourlistNo");

    public final StringPath tourDay = createString("tourDay");

    public final StringPath tourSeq = createString("tourSeq");

    public QPlannerTourlistEntity(String variable) {
        super(PlannerTourlistEntity.class, forVariable(variable));
    }

    public QPlannerTourlistEntity(Path<? extends PlannerTourlistEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPlannerTourlistEntity(PathMetadata metadata) {
        super(PlannerTourlistEntity.class, metadata);
    }

}

