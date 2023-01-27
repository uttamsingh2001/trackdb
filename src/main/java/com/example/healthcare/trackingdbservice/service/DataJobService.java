package com.example.healthcare.trackingdbservice.service;

import com.example.healthcare.trackingdbservice.entity.*;
import com.example.healthcare.trackingdbservice.mapper.DataJobMapper;
import com.example.healthcare.trackingdbservice.model.DataJobRequest;
import com.example.healthcare.trackingdbservice.model.DataJobResponse;
import com.example.healthcare.trackingdbservice.repository.DataJobRepository;
import com.example.healthcare.trackingdbservice.util.Constants;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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

        DataJobEntity oldDataJobEntity=dataJobRepository.findByDataJobGuid(dataJobGuid)
                .orElseThrow(() -> new IllegalArgumentException(Constants.INVALID_INPUT_MSG));
        ;

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
