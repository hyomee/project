package com.hyomee.service.solution.querydsl.casewhen.repository;

import com.hyomee.service.solution.querydsl.casewhen.entity.UnitSvcDtlMEntity;
import com.hyomee.service.solution.querydsl.casewhen.entity.UnitSvcMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitSvcDtlMEntityRepository extends JpaRepository<UnitSvcDtlMEntity, String > {
}
