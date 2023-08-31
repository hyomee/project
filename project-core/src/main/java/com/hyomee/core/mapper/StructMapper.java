package com.hyomee.core.mapper;

import java.util.List;

public interface StructMapper<D,E> {

    // D : DTO , E : Entity

    D toDTO(E entity);
    List<D> toDTOs(List<E> entities);

    E toEntity(D dto);
    List<E> toEntities (List<D> DTOs);

}
