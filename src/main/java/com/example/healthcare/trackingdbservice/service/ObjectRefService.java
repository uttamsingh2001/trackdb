package com.example.healthcare.trackingdbservice.service;


import com.example.healthcare.trackingdbservice.entity.ObjectRefEntity;
import com.example.healthcare.trackingdbservice.mapper.ObjectRefMapper;
import com.example.healthcare.trackingdbservice.model.ObjectRefRequest;
import com.example.healthcare.trackingdbservice.model.ObjectRefResponse;
import com.example.healthcare.trackingdbservice.model.PatchObjectRef;
import com.example.healthcare.trackingdbservice.repository.ObjectRefRepository;
import com.example.healthcare.trackingdbservice.util.Constants;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Log4j2
@Service
public class ObjectRefService {
    private final ObjectRefRepository objectRefRepository;
    private final ObjectRefMapper objectRefMapper;
    public ObjectRefService(ObjectRefRepository objectRefRepository, ObjectRefMapper objectRefMapper) {
        this.objectRefRepository = objectRefRepository;
        this.objectRefMapper = objectRefMapper;
    }

    public ObjectRefResponse createObjectRef(ObjectRefRequest objectRefRequest) {

        ObjectRefEntity objectRefEntity=objectRefMapper.toEntity(objectRefRequest);
        objectRefRepository.save(objectRefEntity);
        log.info("ObjectRef details saved successfully!!!");

        ObjectRefResponse objectRefResponse=objectRefMapper.toModel1(objectRefEntity);
        return objectRefResponse;
    }

    public void patchObjectRefById(PatchObjectRef patchObjectRef, Long refId) {
        Optional<ObjectRefEntity> objectRefEntityOptional = Optional.ofNullable(objectRefRepository.findById(refId)
                .orElseThrow(() -> new IllegalArgumentException(Constants.INVALID_INPUT_MSG)));

        if(objectRefEntityOptional.isPresent()){
            objectRefEntityOptional.get().setObjectRef(patchObjectRef.getObjectRef());
            objectRefRepository.save(objectRefEntityOptional.get());
            log.info("patched id "+refId);
        }else{
            log.info("Id not found " +refId);
        }
    }
}
