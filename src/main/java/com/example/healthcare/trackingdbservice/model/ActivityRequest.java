package com.example.healthcare.trackingdbservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
