package com.hyomee.service.elastic.loading.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hyomee.core.utils.JsonFileReadUtils;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.mapper.EcMapper;
import com.hyomee.service.elastic.tour.repository.TourListDocRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TourlistLoagingService {

  @Value("${tourlistDir}")
  private String tourlistDir;


  private final TourListDocRepository tourListDOCRepository;

  private final Gson gson;



  public void loadingEcTourlist(@NonNull String filename) {

    Reader reader = JsonFileReadUtils.fileLoad(tourlistDir, filename);

    List<TourListEcDTO> tourlistEcDTOs =  gson.fromJson(reader,
            new TypeToken<List<TourListEcDTO>>(){}.getType() );

    List<TourListDoc> tourListDocs = EcMapper.INSTANCE.toTourListDOCs(tourlistEcDTOs);
    int i = 0;
    for (TourListDoc tourListDoc : tourListDocs) {
      tourListDOCRepository.save (tourListDoc);
//      i += 1;
//      if (i > 10 ) break;
    }


  }



}
