package com.example.healthcare.shareddataservice.model;


import com.example.healthcare.shareddataservice.entity.ActivityTypeEntity;
import com.example.healthcare.shareddataservice.entity.MessageEntity;
import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityRequest extends BaseRequest {
    private String activityName;

    private LocalDateTime processingStartDate;

    private LocalDateTime processingEndDate;

    private MessageRequest messageRequest;

    private ActivityTypeRequest activityTypeRequest;

    private ProcessingStatusTypeRequest processingStatusTypeRequest;

}
