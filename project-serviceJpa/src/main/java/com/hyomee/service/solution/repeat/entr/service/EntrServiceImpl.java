package com.hyomee.service.solution.repeat.entr.service;

import com.hyomee.service.solution.repeat.entr.dto.EntrDTO;
import com.hyomee.service.solution.repeat.entr.repository.EntrEntityRespository;
import com.hyomee.service.solution.repeat.entr.repository.EntrMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class EntrServiceImpl implements IEntrService {

    private final EntrEntityRespository entrEntityRespository;

    @Override
    public EntrDTO findById(String entrUuid) {
        return null;
    }

    @Override
    public EntrDTO findByEntrId(String entrId) {
        return null;
    }

    @Override
    public EntrDTO findByCtn(String ctn) {
        return null;
    }
}
