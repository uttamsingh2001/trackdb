package com.example.healthcare.trackingdbservice.mapper;

import com.example.healthcare.trackingdbservice.entity.DataChannelEntity;
import com.example.healthcare.trackingdbservice.model.DataChannelRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataChannelMapper {
        DataChannelEntity toEntity(DataChannelRequest dataChannelRequest);
        DataChannelRequest toModel(DataChannelEntity dataChannelEntity);
}
