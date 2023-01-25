package com.example.healthcare.shareddataservice.entity;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_status_type")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JobStatusTypeEntity  extends BaseEntity  {

    @Id
    @Column(name = "job_status_type_cd",length = 120,nullable = false)
    private String jobStatusTypeCD;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "active_bit",nullable = false)
    private int activeBit;
}
