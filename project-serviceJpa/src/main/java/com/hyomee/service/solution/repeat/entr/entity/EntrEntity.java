package com.hyomee.service.solution.repeat.entr.entity;


import com.hyomee.jpa.entity.AuditVO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@Table(name = "TB_ENTR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Entity
@SuperBuilder
public class EntrEntity extends AuditVO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long entrUuid;

    private String entrId;
    private String ctn;
    private String custNo;

}
