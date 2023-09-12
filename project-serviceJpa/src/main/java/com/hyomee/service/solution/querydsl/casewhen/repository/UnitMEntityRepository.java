package com.hyomee.service.solution.querydsl.casewhen.repository;

import com.hyomee.service.solution.querydsl.casewhen.entity.UnitMEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitMEntityRepository extends JpaRepository<UnitMEntity, String > {
}
