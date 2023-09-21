package com.hyomee.service.solution.repeat.entr.repository;

import com.hyomee.service.solution.querydsl.casewhen.entity.UnitMEntity;
import com.hyomee.service.solution.repeat.entr.entity.EntrEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntrEntityRespository extends JpaRepository<EntrEntity, String > {

    EntrEntity findByCtn(String ctn);
    EntrEntity findByEntrId(String entrId);
}
