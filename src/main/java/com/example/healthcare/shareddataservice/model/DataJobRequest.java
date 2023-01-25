package com.example.healthcare.shareddataservice.model;

import com.example.healthcare.shareddataservice.entity.DataChannelEntity;
import com.example.healthcare.shareddataservice.entity.JobStatusTypeEntity;
import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataJobRequest extends BaseRequest{
    private String jobDirection;
    private String inputFileName;
    private LocalDateTime processingStartDt;
    private LocalDateTime processingEndDt;
    private String dataFeed;
    private String dataSource;
    private String dataPartner;
    private String msgType;
    private String jobType;
    private String externalSystemName;
    private Long orgId;
    private String orgUuid;
    private JobStatusTypeRequest jobStatusTypeRequest;
    private DataChannelRequest dataChannelRequest;

}