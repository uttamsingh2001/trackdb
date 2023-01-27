package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
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