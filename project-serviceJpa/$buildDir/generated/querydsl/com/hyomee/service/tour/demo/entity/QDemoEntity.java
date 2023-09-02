package com.hyomee.service.tour.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QDemoEntity is a Querydsl query type for DemoEntity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDemoEntity extends EntityPathBase<DemoEntity> {

    private static final long serialVersionUID = 1513947057L;

    public static final QDemoEntity demoEntity = new QDemoEntity("demoEntity");

    public final StringPath content = createString("content");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath title = createString("title");

    public QDemoEntity(String variable) {
        super(DemoEntity.class, forVariable(variable));
    }

    public QDemoEntity(Path<? extends DemoEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDemoEntity(PathMetadata metadata) {
        super(DemoEntity.class, metadata);
    }

}

