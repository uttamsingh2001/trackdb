package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobStatusTypeRequest extends BaseRequest   {
    private String jobStatusTypeCD;
    private String description;
    private int activeBit;
}
