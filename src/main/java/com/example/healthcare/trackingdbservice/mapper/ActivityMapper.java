package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.ActivityEntity;
import com.example.healthcare.trackingdbservice.model.ActivityRequest;
import com.example.healthcare.trackingdbservice.model.ActivityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ActivityMapper {

    @Mapping(source = "messageRequest",target = "messageEntity")
    @Mapping(source = "messageRequest.processingStatusTypeRequest",target = "messageEntity.processingStatusTypeEntity")
    @Mapping(source = "activityTypeRequest",target = "activityTypeEntity")
    @Mapping(source = "processingStatusTypeRequest",target = "processingStatusTypeEntity")
    ActivityEntity toEntity(ActivityRequest activityRequest);


    @Mapping(source = "messageEntity",target = "messageRequest")
    @Mapping(source = "messageEntity.processingStatusTypeEntity",target = "messageRequest.processingStatusTypeRequest")
    @Mapping(source = "activityTypeEntity",target = "activityTypeRequest")
    @Mapping(source = "processingStatusTypeEntity",target = "processingStatusTypeRequest")
    ActivityRequest toModel(ActivityEntity activityEntity);
    ActivityResponse toModel1(ActivityEntity activityEntity);




}
