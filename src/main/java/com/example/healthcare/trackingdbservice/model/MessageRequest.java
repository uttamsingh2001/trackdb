package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class MessageRequest extends BaseRequest {

    private String dataJobGuid;
    private String logSessionId;
    private LocalDateTime processingStartDt;
    private LocalDateTime processingEndDt;
    private String attributes;
    private String subjectId;
    private String exceptionMsg;
    private String msgType;
    private String prevMessageGuid;
    private String externalPatientId;
    private Long portalConsumerId;
    private String externalProviderId;
    private Long portalStaffId;
    private String externalMessageId;
    private String errorCd;
    private String errorDescription;
    private String errorSeverity;
    private ProcessingStatusTypeRequest processingStatusTypeRequest;
}
