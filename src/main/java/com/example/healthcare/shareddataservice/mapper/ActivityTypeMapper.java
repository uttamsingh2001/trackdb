package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.ActivityTypeEntity;
import com.example.healthcare.shareddataservice.model.ActivityTypeRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ActivityTypeMapper {
    ActivityTypeEntity toEntity(ActivityTypeRequest activityTypeRequest);

    ActivityTypeRequest toModel(ActivityTypeEntity activityTypeEntity);
}
