package com.hyomee.service.elastic.demo.service;

import com.hyomee.core.utils.UuidUtils;

import com.hyomee.service.elastic.demo.connector.ESClientConnector;
import com.hyomee.service.elastic.demo.dto.DemoDTO;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ESDemoService {

    private final ESClientConnector esClientConnector;

    public String insertDemo(DemoDTO demoDTO)  {
        if (StringUtils.isEmpty(demoDTO.getUuid())) {
            demoDTO.setUuid(UuidUtils.getUUID());
        }
        return esClientConnector.insertDemo(demoDTO);
    }

    public DemoDTO fetchDemoDTOById(String id) {
        return esClientConnector.retrieveDemoDTOById(id);
    }
}
