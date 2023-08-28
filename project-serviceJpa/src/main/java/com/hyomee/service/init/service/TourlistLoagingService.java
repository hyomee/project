package com.hyomee.service.init.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hyomee.core.utils.JsonFileReadUtils;
import com.hyomee.service.tour.dto.TourlistDTO;
import com.hyomee.service.tour.entity.TourlistEntity;
import com.hyomee.service.tour.repository.TourlistRepository;
import com.hyomee.service.tour.repository.WorkMapper;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.Reader;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TourlistLoagingService {

  @Value("${tourlistDir}")
  private String tourlistDir;

  private final TourlistRepository tourlistRepository;

  private final Gson gson;

  public void loadingTourlist(@NonNull String filename) {

    Reader reader = JsonFileReadUtils.fileLoad(this.tourlistDir, filename);

    List<TourlistDTO> tourlistDTOs =  gson.fromJson(reader,
            new TypeToken<List<TourlistDTO>>(){}.getType() );

    List<TourlistEntity> tourlistEntities = WorkMapper.INSTANCE.toTourlistEntitys(tourlistDTOs);

    tourlistRepository.saveAll(tourlistEntities);

  }


}
