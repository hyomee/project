package com.hyomee.service.solution.repeat.entr.service;

import com.hyomee.service.solution.repeat.entr.dto.EntrDTO;

public interface IEntrService {

    EntrDTO findById(String entrUuid);
    EntrDTO findByEntrId(String entrId);

    EntrDTO findByCtn(String ctn);
}
