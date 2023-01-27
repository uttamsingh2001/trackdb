package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.ActivityEntity;
import com.example.healthcare.trackingdbservice.model.ActivityRequest;
import com.example.healthcare.trackingdbservice.model.ActivityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ActivityMapper {

    @Mapping(source = "messageRequest",target = "messageEntity")
    @Mapping(source = "activityTypeRequest",target = "activityTypeEntity")
    @Mapping(source = "processingStatusTypeRequest",target = "processingStatusTypeEntity")
    ActivityEntity toEntity(ActivityRequest activityRequest);
    ActivityRequest toModel(ActivityEntity activityEntity);
    ActivityResponse toModel1(ActivityEntity activityEntity);




}
