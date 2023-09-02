package com.hyomee.service.tour.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTourlistEntity is a Querydsl query type for TourlistEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourlistEntity extends EntityPathBase<TourlistEntity> {

    private static final long serialVersionUID = -1220897191L;

    public static final QTourlistEntity tourlistEntity = new QTourlistEntity("tourlistEntity");

    public final com.hyomee.jpa.entity.QAuditVO _super = new com.hyomee.jpa.entity.QAuditVO(this);

    public final NumberPath<Integer> addCount = createNumber("addCount", Integer.class);

    public final StringPath addr = createString("addr");

    public final StringPath addr2 = createString("addr2");

    public final StringPath areacode = createString("areacode");

    public final StringPath cat1 = createString("cat1");

    public final StringPath cat2 = createString("cat2");

    public final StringPath cat3 = createString("cat3");

    public final StringPath contentid = createString("contentid");

    public final StringPath contenttypeid = createString("contenttypeid");

    public final StringPath firstimage = createString("firstimage");

    public final StringPath firstimage2 = createString("firstimage2");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> localDateTime = _super.localDateTime;

    public final StringPath mapx = createString("mapx");

    public final StringPath mapy = createString("mapy");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath overview = createString("overview");

    public final NumberPath<Integer> recommendCount = createNumber("recommendCount", Integer.class);

    public final StringPath sigungucode = createString("sigungucode");

    public final StringPath tel = createString("tel");

    public final StringPath title = createString("title");

    public final StringPath zipcode = createString("zipcode");

    public QTourlistEntity(String variable) {
        super(TourlistEntity.class, forVariable(variable));
    }

    public QTourlistEntity(Path<? extends TourlistEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTourlistEntity(PathMetadata metadata) {
        super(TourlistEntity.class, metadata);
    }

}

