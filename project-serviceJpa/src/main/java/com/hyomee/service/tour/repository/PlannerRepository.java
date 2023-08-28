package com.hyomee.service.tour.repository;


import com.hyomee.service.tour.entity.PlannerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannerRepository extends JpaRepository<PlannerEntity, String > {
}
