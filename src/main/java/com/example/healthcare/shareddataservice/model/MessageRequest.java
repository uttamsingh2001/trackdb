package com.example.healthcare.shareddataservice.model;

import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.UUID;

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
