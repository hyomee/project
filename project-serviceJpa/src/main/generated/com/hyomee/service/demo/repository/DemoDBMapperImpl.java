package com.hyomee.service.demo.repository;

import com.hyomee.service.demo.dto.DemoDTO;
import com.hyomee.service.demo.entity.DemoEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-29T01:07:49+0900",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.8 (Microsoft)"
)
@Component
public class DemoDBMapperImpl implements DemoDBMapper {

    @Override
    public List<DemoDTO> toDemoDTOs(List<DemoEntity> demoEntities) {
        if ( demoEntities == null ) {
            return null;
        }

        List<DemoDTO> list = new ArrayList<DemoDTO>( demoEntities.size() );
        for ( DemoEntity demoEntity : demoEntities ) {
            list.add( toDemoDTO( demoEntity ) );
        }

        return list;
    }

    @Override
    public DemoEntity toDemoEntitys(DemoDTO demoDTO) {
        if ( demoDTO == null ) {
            return null;
        }

        DemoEntity.DemoEntityBuilder demoEntity = DemoEntity.builder();

        demoEntity.id( demoDTO.getId() );
        demoEntity.title( demoDTO.getTitle() );
        demoEntity.content( demoDTO.getContent() );
        demoEntity.name( demoDTO.getName() );

        return demoEntity.build();
    }

    @Override
    public DemoDTO toDemoDTO(DemoEntity eemoEntity) {
        if ( eemoEntity == null ) {
            return null;
        }

        DemoDTO.DemoDTOBuilder demoDTO = DemoDTO.builder();

        demoDTO.id( eemoEntity.getId() );
        demoDTO.title( eemoEntity.getTitle() );
        demoDTO.content( eemoEntity.getContent() );
        demoDTO.name( eemoEntity.getName() );

        return demoDTO.build();
    }
}
