package com.hyomee.service.solution.querydsl.casewhen.service;

import com.hyomee.core.utils.DateTimeUtils;
import com.hyomee.core.utils.UuidUtils;
import com.hyomee.service.solution.querydsl.casewhen.dto.UnitMDTO;
import com.hyomee.service.solution.querydsl.casewhen.entity.UnitMEntity;
import com.hyomee.service.solution.querydsl.casewhen.entity.UnitSvcDtlMEntity;
import com.hyomee.service.solution.querydsl.casewhen.entity.UnitSvcMEntity;
import com.hyomee.service.solution.querydsl.casewhen.repository.UnitMEntityRepository;
import com.hyomee.service.solution.querydsl.casewhen.repository.UnitMEntityRepositoryImpl;
import com.hyomee.service.solution.querydsl.casewhen.repository.UnitSvcDtlMEntityRepository;
import com.hyomee.service.solution.querydsl.casewhen.repository.UnitSvcMEntityRepository;
import jakarta.persistence.Column;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Thread.sleep;

@RequiredArgsConstructor
@Service
public class CaseWhenService {

    private final UnitMEntityRepository unitMEntityRepository;
    private final UnitSvcMEntityRepository unitSvcMEntityRepository;
    private final UnitSvcDtlMEntityRepository unitSvcDtlMEntityRepository;

    private final UnitMEntityRepositoryImpl unitMEntityRepositoryImpl;

    public String dataLoading()   {
        List<UnitMEntity>  unitMEntityList = new LinkedList<>();

        for( int i = 0 ;  i < 100; i ++) {
            String odrEcptId = UuidUtils.getUUID();
            String pgrsStusCd = i / 10 == 0 ? "E" : "C";
            String unitId = UnitMEntity.getUnitId();
            String rcptDttm = DateTimeUtils.getStringCurrentDateTime();
            String ordRcptId = UuidUtils.getUUID();

            UnitMEntity unitMEntity = UnitMEntity.builder()
                    .unitId(unitId)
                    .rcptDttm(rcptDttm)
                    .odrRcptId(ordRcptId)
                    .odrEvntNm(odrEcptId)
                    .pgrsStusCd(pgrsStusCd)
                    .prssRstCs("S")
                    .build();



            List<UnitSvcMEntity>  unitSvcMEntityLinkedList = new LinkedList<>();
            List<UnitSvcDtlMEntity>  unitSvcDtlMEntityLinkedList = new LinkedList<>();

            for( int j = 0 ;  j < 5; j ++) {

                String unitSvcId = UnitSvcMEntity.getUnitId();
                String prssRsltCd = "S";
                String unitSvcDivCd = "HIDS";
                unitSvcDivCd =  i / 5 == 0 ? "CAS" : unitSvcDivCd;
                unitSvcDivCd =  i / 5 == 1 ? "TRX1" : unitSvcDivCd;
                unitSvcDivCd =  i / 5 == 2 ? "TRX2" : unitSvcDivCd;
                unitSvcDivCd =  i / 5 == 3 ? "HDTV" : unitSvcDivCd;


                prssRsltCd = i / 5 == 0 ? "C" : prssRsltCd;
                prssRsltCd = i / 5 == 1 ? "S" : prssRsltCd;
                prssRsltCd = i / 5 == 2 ? "C" : prssRsltCd;
                prssRsltCd = i / 5 == 3 ? "S" : prssRsltCd;

                if ("E".equals(pgrsStusCd)) {
                    prssRsltCd = i / 5 == 0 ? "E" : prssRsltCd;
                }

                UnitSvcMEntity unitSvcMEntity = UnitSvcMEntity.builder()
                        .unitSvcId(unitSvcId)
                        .unitId(unitId)
                        .rcptDttm(rcptDttm)
                        .odrRcptId(ordRcptId)
                        .sendMsgCntn("")
                        .unitSvcDivCd(unitSvcDivCd)
                        .prssRsltCd(prssRsltCd)
                        .build();

                String unitSvcDtlId = UnitSvcDtlMEntity.getUnitId();
                UnitSvcDtlMEntity unitSvcDtlMEntity = UnitSvcDtlMEntity.builder()
                        .unitSvcDtlId(unitSvcDtlId )
                        .unitSvcId(unitSvcId)
                        .odrRcptId(ordRcptId)
                        .sendMsgCntn("")
                        .unitSvcDivCd(unitSvcDivCd)
                        .pgrsStusCd(prssRsltCd)
                        .rcptDttm(rcptDttm)
                        .trstCntn("")
                        .trstRsltCd(prssRsltCd)
                        .build();

                unitSvcMEntityLinkedList.add(unitSvcMEntity);
                unitSvcDtlMEntityLinkedList.add(unitSvcDtlMEntity);
            }

            unitMEntityList.add(unitMEntity);

            unitMEntityRepository.saveAll(unitMEntityList);
            unitSvcMEntityRepository.saveAll(unitSvcMEntityLinkedList);
            unitSvcDtlMEntityRepository.saveAll(unitSvcDtlMEntityLinkedList);

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                // throw new RuntimeException(e);
            }


        }
        return "OK";
    }


    public UnitMDTO caseWhenSubQuery() {

        return unitMEntityRepositoryImpl.caseWhenSubQuery();
    }
}
