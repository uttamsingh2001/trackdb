package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.JobStatusTypeEntity;
import com.example.healthcare.shareddataservice.model.JobStatusTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobStatusTypeMapper {

    JobStatusTypeEntity toEntity(JobStatusTypeRequest jobStatusTypeRequest);
    JobStatusTypeRequest toModel(JobStatusTypeEntity jobStatusTypeEntity);

}
