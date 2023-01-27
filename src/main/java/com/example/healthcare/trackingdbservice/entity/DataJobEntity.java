package com.example.healthcare.trackingdbservice.entity;

import com.example.healthcare.trackingdbservice.entity.base.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
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
@Table(name="data_job")
@EqualsAndHashCode(callSuper = true)
public class DataJobEntity extends BaseEntity  {
    @Id
    @SequenceGenerator(name = "seq_address_id", sequenceName = "seq_address_id",initialValue = 1000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_address_id")
    @Column(name = "data_job_id",nullable = false)
    private Long dataJobId;
    @Column(name = "job_direction",length = 1)
    private String jobDirection;

    @Column(name = "data_job_guid",nullable = false,length = 38)
    private String dataJobGuid= String.valueOf(UUID.randomUUID());

    @Column(name = "input_file_name",length = 100)
    private String inputFileName;
    @Column(name = "processing_start_dt", nullable = false,length = 6)
    private LocalDateTime processingStartDt;
    @Column(name = "processing_end_dt",length = 6)
    private LocalDateTime processingEndDt;
    @Column(name = "data_feed",length = 100)
    private String dataFeed;
    @Column(name = "data_source",length = 100)
    private String dataSource;
    @Column(name = "data_partner",length = 100)
    private String dataPartner;
    @Column(name = "msg_type",length = 100,nullable = false)
    private String msgType;
    @Column(name = "job_type",length = 20)
    private String jobType;
    @Column(name = "external_system_name",length = 255)
    private String externalSystemName;
    @Column(name = "org_id")
    private Long orgId;
    @Column(name = "org_uuid",length = 38)
    private String orgUuid;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "job_status_type_cd",nullable = false)
    private JobStatusTypeEntity jobStatusTypeEntity;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "data_channel")
    private DataChannelEntity dataChannelEntity;

}