package com.example.healthcare.shareddataservice.entity.base;//package com.crossasyst.healthcare.ca.shareddataservice.entity.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

@MappedSuperclass  //common persistence super class it define common behavior across set of classes
@Data
public class BaseEntity     {
    @CreationTimestamp
    @Column(name = "created_ts", updatable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime createdTs;


    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @UpdateTimestamp
    @Column(name = "updated_ts")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime updatedTs;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "revision", length=100,nullable = false)
    private Integer revision;

}
