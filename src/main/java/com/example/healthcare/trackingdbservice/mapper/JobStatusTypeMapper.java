package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.JobStatusTypeEntity;
import com.example.healthcare.trackingdbservice.model.JobStatusTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface JobStatusTypeMapper {

    JobStatusTypeEntity toEntity(JobStatusTypeRequest jobStatusTypeRequest);
    JobStatusTypeRequest toModel(JobStatusTypeEntity jobStatusTypeEntity);

}
