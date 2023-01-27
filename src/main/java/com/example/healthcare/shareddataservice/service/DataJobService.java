package com.example.healthcare.shareddataservice.service;

import com.example.healthcare.shareddataservice.entity.*;
import com.example.healthcare.shareddataservice.mapper.DataJobMapper;
import com.example.healthcare.shareddataservice.model.DataJobRequest;
import com.example.healthcare.shareddataservice.model.DataJobResponse;
import com.example.healthcare.shareddataservice.repository.DataJobRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;

@Log4j2
@Service
public class DataJobService {

    private final DataJobRepository dataJobRepository;
    private final DataJobMapper dataJobMapper;

    public DataJobService(DataJobRepository dataJobRepository, DataJobMapper dataJobMapper) {
        this.dataJobRepository = dataJobRepository;
        this.dataJobMapper = dataJobMapper;
    }

    public DataJobResponse createDataJob(DataJobRequest dataJobRequest) {

        DataJobEntity dataJobEntity = dataJobMapper.toEntity(dataJobRequest);
        dataJobRepository.save(dataJobEntity);
        log.info("DataJob details saved successfully!!!");

        DataJobResponse dataJobResponse = dataJobMapper.toModel1(dataJobEntity);
        return dataJobResponse;

    }
    public void updateDataJob(String dataJobGuid, DataJobRequest dataJobRequest) {

        DataJobEntity oldDataJobEntity=dataJobRepository.findByDataJobGuid(dataJobGuid);

        Long dataJobId=oldDataJobEntity.getDataJobId();
        JobStatusTypeEntity jobStatusTypeEntity=oldDataJobEntity.getJobStatusTypeEntity();
        DataChannelEntity dataChannelEntity=oldDataJobEntity.getDataChannelEntity();
        String jobStatusTypeCD= jobStatusTypeEntity.getJobStatusTypeCD();
        String dataChannelCd=dataChannelEntity.getDataChannelCd();
        DataJobEntity newDataJobEntity=dataJobMapper.toEntity(dataJobRequest);
        newDataJobEntity.setDataJobGuid(dataJobGuid);
        newDataJobEntity.setDataJobId(dataJobId);
        newDataJobEntity.getDataChannelEntity().setDataChannelCd(dataChannelCd);
        newDataJobEntity.getJobStatusTypeEntity().setJobStatusTypeCD(jobStatusTypeCD);
        dataJobRepository.save(newDataJobEntity);

        log.info("Data Job updated Successfully!!!");


    }
}
