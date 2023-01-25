package com.example.healthcare.shareddataservice.entity;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Activity")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ActivityEntity extends BaseEntity  {

    @Id
    @SequenceGenerator(name = "activity_id", sequenceName = "activity_id", initialValue = 1000 ,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_id")
    @Column(name = "activity_id",nullable = false)
    private Long activityId;

    @Column(name = "activity_name", length=120)
    private String activityName;

    @CreationTimestamp
    @Column(name = "processing_start_dt",nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private LocalDateTime processingStartDate;

    @CreationTimestamp
    @Column(name = "processing_end_dt",updatable = false)
    private LocalDateTime processingEndDate;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "msg_id", nullable = false)
    private MessageEntity messageEntity;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_type", nullable = false)
    private ActivityTypeEntity activityTypeEntity;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "processing_status_type_cd", nullable = false)
    private ProcessingStatusTypeEntity processingStatusTypeEntity;


}
