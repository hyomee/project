package com.hyomee.service.tour.repository;


import com.hyomee.service.tour.entity.PlannerTourlistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlannerTourlistRepository extends JpaRepository<PlannerTourlistEntity, String > {
}
