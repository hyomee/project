package com.hyomee.service.solution.repeat.svc.service;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service("productChg")
public class SvcProductChgServiceImpl implements SvcService{
    @Override
    public void process(String ctn) {
        log.debug("SvcProductChgServiceImpl :: " + ctn);
    }
}
