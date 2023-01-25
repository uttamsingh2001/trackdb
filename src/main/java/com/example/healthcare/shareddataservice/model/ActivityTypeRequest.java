package com.example.healthcare.shareddataservice.model;

import javax.persistence.*;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTypeRequest extends BaseRequest {
    private String activityTypeCd;
    private String description;
    private int activeBit;

}
