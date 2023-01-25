package com.example.healthcare.shareddataservice.model;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessingStatusTypeRequest extends BaseRequest {
    private String processingStatusTypeCD;
    private String description;
    private int activeBit;
}
