package com.hyomee.service.solution.repeat.svc.service;

import com.hyomee.service.solution.repeat.entr.service.IEntrService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service("subscriber")
public class SvcServiceImpl implements SvcService {

    private final IEntrService  iEntrService;

    @Override
    public void process(String ctn) {
        log.debug(ctn);
        // iEntrService.findByCtn(ctn);
    }
}
