package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.NodeTypeEntity;
import com.example.healthcare.trackingdbservice.model.NodeTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NodeTypeMapper {


    NodeTypeEntity toEntity(NodeTypeRequest nodeTypeRequest);
    NodeTypeRequest toModel(NodeTypeEntity nodeTypeEntity);

}
