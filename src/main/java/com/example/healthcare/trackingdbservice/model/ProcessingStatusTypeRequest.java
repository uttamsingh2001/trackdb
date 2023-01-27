package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingStatusTypeRequest extends BaseRequest {
    private String processingStatusTypeCD;
    private String description;
    private int activeBit;
}
