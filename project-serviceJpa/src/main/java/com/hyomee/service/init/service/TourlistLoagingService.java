package com.hyomee.service.init.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hyomee.core.utils.JsonFileReadUtils;
import com.hyomee.core.utils.UuidUtils;
import com.hyomee.service.tour.dto.TourlistDTO;
import com.hyomee.service.tour.entity.TourlistEntity;
import com.hyomee.service.tour.mapper.TourlistMapper;
import com.hyomee.service.tour.repository.TourlistRepository;
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

    for( int i = 0 ; i < tourlistDTOs.size() ; i++) {
      tourlistDTOs.get(i).setRecommendCount(UuidUtils.getRandom(300,50));
      tourlistDTOs.get(i).setAddCount(UuidUtils.getRandom(100,20));
    }

    List<TourlistEntity> tourlistEntities = TourlistMapper.INSTANCE.toEntities(tourlistDTOs);

    tourlistRepository.saveAll(tourlistEntities);

  }


}
