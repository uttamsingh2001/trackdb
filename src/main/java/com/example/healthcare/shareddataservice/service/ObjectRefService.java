package com.example.healthcare.shareddataservice.service;


import com.example.healthcare.shareddataservice.entity.ObjectRefEntity;
import com.example.healthcare.shareddataservice.mapper.ObjectRefMapper;
import com.example.healthcare.shareddataservice.model.ObjectRefRequest;
import com.example.healthcare.shareddataservice.model.ObjectRefResponse;
import com.example.healthcare.shareddataservice.model.PatchObjectRef;
import com.example.healthcare.shareddataservice.repository.ObjectRefRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Map;
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
        ObjectRefResponse objectRefResponse=objectRefMapper.toModel1(objectRefEntity);
        return objectRefResponse;
    }

    public void patchObjectRef(Long objectRefID, Map<String, Object> fields) {
        Optional<ObjectRefEntity> objectRefEntity=objectRefRepository.findById(objectRefID);

        if(objectRefEntity.isPresent()) {
            fields.forEach((key, value) -> {

                Field field = ReflectionUtils.findField(ObjectRefEntity.class, key);
                field.setAccessible(true);
                ReflectionUtils.setField(field, objectRefEntity, value);

            });

            objectRefRepository.save(objectRefEntity.get());
        }

    }

    public void patchObjectRefById(PatchObjectRef patchObjectRef, Long refid) {
        Optional<ObjectRefEntity> objectRefEntityOptional = objectRefRepository.findById(refid);
        if(objectRefEntityOptional.isPresent()){
            objectRefEntityOptional.get().setObjectRef(patchObjectRef.getObjectRef());
            objectRefRepository.save(objectRefEntityOptional.get());
            log.info("patched id "+refid);
        }else{
            log.info("Id not found " +refid);
        }
    }
}
