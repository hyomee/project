package com.hyomee.service.solution.querydsl.casewhen.repository;

import com.hyomee.service.solution.querydsl.casewhen.dto.PvsOrderDTO;
import com.hyomee.service.solution.querydsl.casewhen.dto.UnitMDTO;
import com.hyomee.service.solution.querydsl.casewhen.entity.QUnitMEntity;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.core.types.dsl.StringTemplate;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

@Slf4j
@RequiredArgsConstructor
@Repository
public class UnitMEntityRepositoryImpl {

    private final JPAQueryFactory jpaQueryFactory;


    private final QUnitMEntity qunitMEntity = QUnitMEntity.unitMEntity;
    public UnitMDTO caseWhenSubQuery() {
        StringTemplate subctr = Expressions.stringTemplate("substr({0}, {1}, {2})",
                qunitMEntity.unitId, 6,10);


        StringTemplate caseId = Expressions.stringTemplate("concat(substr({0},6,10), substr({1},15,1), '0')",
                qunitMEntity.unitId,qunitMEntity.unitId );


        UnitMDTO unitMDTO = jpaQueryFactory.select(
                        Projections.bean(UnitMDTO.class,
                                        qunitMEntity.unitId
                                        , subctr.as("substrUnitId")
                                        , caseId.as("castId")
                            )
                        )
                .from(qunitMEntity)
                .where(qunitMEntity.unitId.eq("MAIN_20230913132610fe6da1")).fetchOne();
        log.debug(subctr.toString());
        return unitMDTO;
    }
}
