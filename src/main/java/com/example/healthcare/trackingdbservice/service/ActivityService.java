package com.example.healthcare.trackingdbservice.service;

import com.example.healthcare.trackingdbservice.entity.ActivityEntity;
import com.example.healthcare.trackingdbservice.entity.ActivityTypeEntity;
import com.example.healthcare.trackingdbservice.entity.MessageEntity;
import com.example.healthcare.trackingdbservice.entity.ProcessingStatusTypeEntity;
import com.example.healthcare.trackingdbservice.mapper.ActivityMapper;
import com.example.healthcare.trackingdbservice.model.ActivityRequest;
import com.example.healthcare.trackingdbservice.model.ActivityResponse;
import com.example.healthcare.trackingdbservice.repository.ActivityRepository;
import com.example.healthcare.trackingdbservice.util.Constants;
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
        log.info("Activity details saved successfully!!!");

        ActivityResponse activityResponse = activityMapper.toModel1(activityEntity);
        return activityResponse;

    }

    public void updateActivities(Long activityId, ActivityRequest activityRequest) {

        ActivityEntity activityEntity = activityRepository.findById(activityId)
                .orElseThrow(() -> new IllegalArgumentException(Constants.INVALID_INPUT_MSG));

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

        log.info("Activities Updated successfully!!!");

    }

    public ActivityRequest getActivities(Long activityId) {
        ActivityEntity activityEntity=activityRepository.findById(activityId).get();
        ActivityRequest activityRequest=activityMapper.toModel(activityEntity);
        return activityRequest;


    }

//    public ActivityRequest searchActivities(Long msgId) {
//        Optional<ActivityEntity> optionalActivityEntity = activityRepository.findBymsgId(msgId);
//        ActivityRequest activity = new ActivityRequest();
//        if (optionalActivityEntity.isPresent()) {
//            activity = activityMapper.toModel(optionalActivityEntity.get());
//            log.info("Found activities with message id {}", msgId);
//        } else {
//            log.info("Activity not found with the message id{}", msgId);
//        }
//        return activity;
//    }

}
