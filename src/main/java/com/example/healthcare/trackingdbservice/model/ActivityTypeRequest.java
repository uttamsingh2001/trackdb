package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTypeRequest extends BaseRequest {
    private String activityTypeCd;
    private String description;
    private int activeBit;

}
