package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.DataJobEntity;
import com.example.healthcare.trackingdbservice.model.DataJobRequest;
import com.example.healthcare.trackingdbservice.model.DataJobResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DataJobMapper {

    @Mapping(source = "jobStatusTypeRequest", target = "jobStatusTypeEntity")
    @Mapping(source = "dataChannelRequest", target = "dataChannelEntity")
    DataJobEntity toEntity(DataJobRequest dataJobRequest);
    DataJobRequest toModel(DataJobEntity dataJobEntity);
    DataJobResponse toModel1(DataJobEntity dataJobEntity);

}
