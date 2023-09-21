package com.hyomee.service.solution.repeat.entr.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EntrDTO {

    private long entrUuid;

    private String entrId;
    private String ctn;
    private String custNo;

}
