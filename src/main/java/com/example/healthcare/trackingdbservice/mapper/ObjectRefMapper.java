package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.ObjectRefEntity;
import com.example.healthcare.trackingdbservice.model.ObjectRefRequest;
import com.example.healthcare.trackingdbservice.model.ObjectRefResponse;
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
