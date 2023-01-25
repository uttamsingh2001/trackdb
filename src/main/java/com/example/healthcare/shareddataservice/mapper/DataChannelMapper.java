package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.DataChannelEntity;
import com.example.healthcare.shareddataservice.model.DataChannelRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataChannelMapper {
        DataChannelEntity toEntity(DataChannelRequest dataChannelRequest);
        DataChannelRequest toModel(DataChannelEntity dataChannelEntity);
}
