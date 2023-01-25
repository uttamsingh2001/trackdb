package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.ObjectRefEntity;
import com.example.healthcare.shareddataservice.model.ObjectRefRequest;
import com.example.healthcare.shareddataservice.model.ObjectRefResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ObjectRefMapper {

    @Mapping(source = "nodeTypeRequest", target = "nodeTypeEntity")
    @Mapping(source = "messageRequest",target="messageEntity")
    ObjectRefEntity toEntity(ObjectRefRequest objectRefRequest);
    ObjectRefRequest toModel(ObjectRefEntity objectRefEntity);
    ObjectRefResponse toModel1(ObjectRefEntity objectRefEntity);


}
