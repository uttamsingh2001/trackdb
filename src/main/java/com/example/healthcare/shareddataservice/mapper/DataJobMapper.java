package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.DataJobEntity;
import com.example.healthcare.shareddataservice.model.DataJobRequest;
import com.example.healthcare.shareddataservice.model.DataJobResponse;
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
