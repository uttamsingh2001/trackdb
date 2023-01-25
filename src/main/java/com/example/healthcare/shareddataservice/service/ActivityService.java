package com.example.healthcare.shareddataservice.service;

import com.example.healthcare.shareddataservice.entity.ActivityEntity;
import com.example.healthcare.shareddataservice.entity.ActivityTypeEntity;
import com.example.healthcare.shareddataservice.entity.MessageEntity;
import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import com.example.healthcare.shareddataservice.mapper.ActivityMapper;
import com.example.healthcare.shareddataservice.model.ActivityRequest;
import com.example.healthcare.shareddataservice.model.ActivityResponse;
import com.example.healthcare.shareddataservice.repository.ActivityRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class ActivityService {
    private final ActivityRepository activityRepository;
    private final ActivityMapper activityMapper;

    public ActivityService(ActivityRepository activityRepository, ActivityMapper activityMapper) {
        this.activityRepository = activityRepository;
        this.activityMapper = activityMapper;
    }

    public ActivityResponse createActivities(ActivityRequest activityRequest) {
        ActivityEntity activityEntity = activityMapper.toEntity(activityRequest);
        activityRepository.save(activityEntity);
        ActivityResponse activityResponse = activityMapper.toModel1(activityEntity);
        return activityResponse;

    }

    public void updateActivities(Long activityId, ActivityRequest activityRequest) {

        ActivityEntity activityEntity = activityRepository.findById(activityId).get();

        MessageEntity messageEntity = activityEntity.getMessageEntity();
        ActivityTypeEntity activityTypeEntity = activityEntity.getActivityTypeEntity();
        ProcessingStatusTypeEntity processingStatusTypeEntity = activityEntity.getProcessingStatusTypeEntity();

        Long msgId = messageEntity.getMsgId();
        String activityTypeCd = activityTypeEntity.getActivityTypeCd();
        String processingStatusTypeCD = processingStatusTypeEntity.getProcessingStatusTypeCD();

        ActivityEntity newActivityEntity = activityMapper.toEntity(activityRequest);

        newActivityEntity.setActivityId(activityId);
        newActivityEntity.getMessageEntity().setMsgId(msgId);
        newActivityEntity.getActivityTypeEntity().setActivityTypeCd(activityTypeCd);
        newActivityEntity.getProcessingStatusTypeEntity().setProcessingStatusTypeCD(processingStatusTypeCD);

        activityRepository.save(newActivityEntity);
        log.info("Data Updated successfully!!!");


    }
}
