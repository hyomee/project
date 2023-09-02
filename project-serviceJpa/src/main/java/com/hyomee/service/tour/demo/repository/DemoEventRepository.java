package com.hyomee.service.tour.demo.repository;


import com.hyomee.service.tour.demo.entity.DemoEntity;
import com.hyomee.service.tour.demo.entity.DemoEventEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoEventRepository extends JpaRepository<DemoEventEntity, Long > {
  DemoEventEntity findByName(String name);
}
