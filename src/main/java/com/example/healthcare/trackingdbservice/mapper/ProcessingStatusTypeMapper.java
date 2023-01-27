package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.ProcessingStatusTypeEntity;
import com.example.healthcare.trackingdbservice.model.ProcessingStatusTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProcessingStatusTypeMapper{

    ProcessingStatusTypeEntity toEntity(ProcessingStatusTypeRequest processingStatusTypeRequest);

    ProcessingStatusTypeRequest toModel(ProcessingStatusTypeEntity processingStatusTypeEntity);
}
