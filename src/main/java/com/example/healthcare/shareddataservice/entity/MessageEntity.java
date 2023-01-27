package com.example.healthcare.shareddataservice.entity;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="msg")
@EqualsAndHashCode(callSuper = true)
public class MessageEntity extends BaseEntity  {
    @Id
    @SequenceGenerator(name = "msg_id", sequenceName = "msg_id",initialValue = 1000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "msg_id")
    @Column(name = "msg_id",nullable = false)
    private Long msgId;
    @Column(name = "data_job_guid",length = 38,nullable = false)
    private String dataJobGuid;
    @Column(name = "log_session_id",length = 38,nullable = false)
    private String logSessionId;
    @Column(name = "processing_start_dt",nullable = false)
    private LocalDateTime processingStartDt;
    @Column(name = "processing_end_dt")
    private LocalDateTime processingEndDt;
    @Column(name = "attribute")
    private String attributes;
    @Column(name = "subject_id",length = 120)
    private String subjectId;
    @Column(name = "exception_msg")
    private String exceptionMsg;
    @Column(name = "msg_type",length = 100,nullable = false)
    private String msgType;
    @Column(name = "message_guid",length = 38,nullable = false)
    private String messageGuid= String.valueOf(UUID.randomUUID());

    @Column(name = "prev_massage_guid",length = 38)
    private String prevMessageGuid;
    @Column(name = "external_patient_id",length = 120)
    private String externalPatientId;
    @Column(name = "portal_consumer_id")
    private Long portalConsumerId;
    @Column(name = "external_provider_id",length = 120)
    private String externalProviderId;
    @Column(name = "portal_staff_id")
    private Long portalStaffId;
    @Column(name = "external_message_id",length = 120)
    private String externalMessageId;
    @Column(name = "error_cd",length = 50)
    private String errorCd;
    @Column(name = "error_description",length = 500)
    private String errorDescription;
    @Column(name = "error_severity",length = 20)
    private String errorSeverity;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "processing_status_type")
    private ProcessingStatusTypeEntity processingStatusTypeEntity;
}