package com.example.healthcare.shareddataservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
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
