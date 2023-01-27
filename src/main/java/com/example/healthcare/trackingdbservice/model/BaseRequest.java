package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseRequest {
    private LocalDateTime createdTs;
    private Long createdBy;
    private LocalDateTime updatedTs;
    private Long updatedBy;
    private Integer revision;
}
