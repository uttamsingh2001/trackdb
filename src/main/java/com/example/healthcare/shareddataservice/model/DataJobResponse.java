package com.example.healthcare.shareddataservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataJobResponse {
    private Long dataJobId;
    private String dataJobGuid;
}
