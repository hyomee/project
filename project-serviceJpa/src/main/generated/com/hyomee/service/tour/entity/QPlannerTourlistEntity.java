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

    public final StringPath planNo = createString("planNo");

    public final NumberPath<Integer> tourDay = createNumber("tourDay", Integer.class);

    public final StringPath tourNo = createString("tourNo");

    public final NumberPath<Integer> tourSeq = createNumber("tourSeq", Integer.class);

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

