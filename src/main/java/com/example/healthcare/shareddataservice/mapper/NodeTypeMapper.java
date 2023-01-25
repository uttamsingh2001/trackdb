package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.NodeTypeEntity;
import com.example.healthcare.shareddataservice.model.NodeTypeRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface NodeTypeMapper {


    NodeTypeEntity toEntity(NodeTypeRequest nodeTypeRequest);
    NodeTypeRequest toModel(NodeTypeEntity nodeTypeEntity);

}
