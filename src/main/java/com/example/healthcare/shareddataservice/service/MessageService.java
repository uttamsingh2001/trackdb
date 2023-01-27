package com.example.healthcare.shareddataservice.service;

import com.example.healthcare.shareddataservice.entity.MessageEntity;
import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import com.example.healthcare.shareddataservice.mapper.MessageMapper;
import com.example.healthcare.shareddataservice.model.MessageRequest;
import com.example.healthcare.shareddataservice.model.MessageResponse;
import com.example.healthcare.shareddataservice.repository.MessageRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class MessageService {

    private final MessageRepository messageRepository;
    private final MessageMapper messageMapper;

    public MessageService(MessageRepository messageRepository, MessageMapper messageMapper) {
        this.messageRepository = messageRepository;
        this.messageMapper = messageMapper;
    }

    public MessageResponse createMessage(MessageRequest messageRequest) {
        MessageEntity messageEntity = messageMapper.toEntity(messageRequest);
        messageRepository.save(messageEntity);
        log.info("Message details saved successfully!!!");

        MessageResponse messageResponse = messageMapper.toModel1(messageEntity);
        return messageResponse;
    }

    public MessageRequest updateMessage(String messageGuid, MessageRequest messageRequest) {
        MessageEntity oldMessageEntity = messageRepository.findByMessageGuid(messageGuid);

        Long msgId = oldMessageEntity.getMsgId();
        ProcessingStatusTypeEntity processingStatusTypeEntity = oldMessageEntity.getProcessingStatusTypeEntity();
        String processingStatusTypeCd = processingStatusTypeEntity.getProcessingStatusTypeCD();
        MessageEntity newMessageEntity = messageMapper.toEntity(messageRequest);
        newMessageEntity.setMessageGuid(messageGuid);
        newMessageEntity.setMsgId(msgId);
        newMessageEntity.getProcessingStatusTypeEntity().setProcessingStatusTypeCD(processingStatusTypeCd);
        messageRepository.save(newMessageEntity);
        log.info("Message updated successfully!!!");

        return messageRequest;
    }
}
