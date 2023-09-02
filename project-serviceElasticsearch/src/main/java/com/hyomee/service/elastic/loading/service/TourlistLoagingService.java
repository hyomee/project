package com.hyomee.service.elastic.loading.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hyomee.core.utils.JsonFileReadUtils;
import com.hyomee.core.utils.UuidUtils;
import com.hyomee.service.elastic.tour.doc.TourListDoc;
import com.hyomee.service.elastic.tour.dto.TourListEcDTO;
import com.hyomee.service.elastic.tour.mapper.EcMapper;
import com.hyomee.service.elastic.tour.repository.TourListDocRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
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

    List<TourListEcDTO> tourlistDTOs =  gson.fromJson(reader,
            new TypeToken<List<TourListEcDTO>>(){}.getType() );



    for( int i = 0 ; i < tourlistDTOs.size() ; i++) {
//      if (StringUtils.isEmpty(tourlistEcDTOTmp.getAreacode())) tourlistEcDTOTmp.setAreacode("0");
//      if (StringUtils.isEmpty(tourlistEcDTOTmp.getBooktour())) tourlistEcDTOTmp.setBooktour("0");
//      if (StringUtils.isEmpty(tourlistEcDTOTmp.getMlevel())) tourlistEcDTOTmp.setMlevel("0");
//      tourlistDTOs.get(i).setAreacode(StringUtils.defaultString());
//      tourlistDTOs.get(i).setBooktour(UuidUtils.getRandom(300,50));

      tourlistDTOs.get(i).setRecommendCount(UuidUtils.getRandom(300,50));
      tourlistDTOs.get(i).setAddCount(UuidUtils.getRandom(100,20));
    }
    List<TourListDoc> tourListDocs = EcMapper.INSTANCE.toTourListDOCs(tourlistDTOs);
    int i = 0;
    for (TourListDoc tourListDoc : tourListDocs) {
      tourListDOCRepository.save (tourListDoc);
//      i += 1;
//      if (i > 10 ) break;
    }


  }



}
