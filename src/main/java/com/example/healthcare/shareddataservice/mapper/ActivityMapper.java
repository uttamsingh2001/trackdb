package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.ActivityEntity;
import com.example.healthcare.shareddataservice.model.ActivityRequest;
import com.example.healthcare.shareddataservice.model.ActivityResponse;
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

//    @Mapping(source = "messageRequest",target = "messageEntity")
////    @Mapping(source = "messageRequest.processingStatusTypeRequest",target = "messageEntity.processingStatusTypeEntity")
//    @Mapping(source = "activityTypeRequest",target = "activityTypeEntity")
//    @Mapping(source = "processingStatusTypeRequest", target = "processingStatusTypeEntity")
//    ActivityEntity toEntity(ActivityRequest activityRequest);
//    ActivityRequest toModel(ActivityEntity activityEntity);
//    ActivityResponse toModel1(ActivityEntity activityEntity);

}
