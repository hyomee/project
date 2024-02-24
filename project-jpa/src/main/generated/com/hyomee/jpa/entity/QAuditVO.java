package com.hyomee.jpa.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditVO is a Querydsl query type for AuditVO
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAuditVO extends BeanPath<AuditVO> {

    private static final long serialVersionUID = -752920146L;

    public static final QAuditVO auditVO = new QAuditVO("auditVO");

    public final DateTimePath<java.time.LocalDateTime> createDateTime = createDateTime("createDateTime", java.time.LocalDateTime.class);

    public final StringPath createUserid = createString("createUserid");

    public final DateTimePath<java.time.LocalDateTime> updateDataTime = createDateTime("updateDataTime", java.time.LocalDateTime.class);

    public final StringPath updateUserId = createString("updateUserId");

    public QAuditVO(String variable) {
        super(AuditVO.class, forVariable(variable));
    }

    public QAuditVO(Path<? extends AuditVO> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditVO(PathMetadata metadata) {
        super(AuditVO.class, metadata);
    }

}

