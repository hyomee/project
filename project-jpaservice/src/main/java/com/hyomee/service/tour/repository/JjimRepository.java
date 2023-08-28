package com.hyomee.service.tour.repository;


import com.hyomee.service.tour.entity.JjimEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JjimRepository extends JpaRepository<JjimEntity, String> {
}
