package com.example.healthcare.shareddataservice.model;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobStatusTypeRequest extends BaseRequest   {
    private String jobStatusTypeCD;
    private String description;
    private int activeBit;
}
