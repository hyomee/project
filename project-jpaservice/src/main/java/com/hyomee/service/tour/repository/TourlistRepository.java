package com.hyomee.service.tour.repository;


import com.hyomee.service.tour.entity.TourlistEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourlistRepository extends JpaRepository<TourlistEntity, String > , TourlistCustomRespository {
  List<TourlistEntity> findByTitleContains(String title, Pageable pageable);
  Page<TourlistEntity> findTourlistEntitiesByTitleContains(String title, Pageable pageable);

}
