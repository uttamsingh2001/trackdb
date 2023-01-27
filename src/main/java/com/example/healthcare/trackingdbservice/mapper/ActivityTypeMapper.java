package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.ActivityTypeEntity;
import com.example.healthcare.trackingdbservice.model.ActivityTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityTypeMapper {
    ActivityTypeEntity toEntity(ActivityTypeRequest activityTypeRequest);

    ActivityTypeRequest toModel(ActivityTypeEntity activityTypeEntity);
}
