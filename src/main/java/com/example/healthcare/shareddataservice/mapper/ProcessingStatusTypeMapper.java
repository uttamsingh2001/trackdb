package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import com.example.healthcare.shareddataservice.model.ProcessingStatusTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProcessingStatusTypeMapper{

    ProcessingStatusTypeEntity toEntity(ProcessingStatusTypeRequest processingStatusTypeRequest);

    ProcessingStatusTypeRequest toModel(ProcessingStatusTypeEntity processingStatusTypeEntity);
}
