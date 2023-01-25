package com.example.healthcare.shareddataservice.mapper;

import com.example.healthcare.shareddataservice.entity.MessageEntity;
import com.example.healthcare.shareddataservice.model.MessageRequest;
import com.example.healthcare.shareddataservice.model.MessageResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MessageMapper {

    @Mapping(source = "processingStatusTypeRequest", target = "processingStatusTypeEntity")
    MessageEntity toEntity(MessageRequest messageRequest);
    MessageRequest toModel(MessageEntity messageEntity);
    MessageResponse toModel1(MessageEntity messageEntity);
}
