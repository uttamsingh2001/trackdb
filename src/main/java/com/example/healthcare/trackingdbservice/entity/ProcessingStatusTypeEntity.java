package com.example.healthcare.trackingdbservice.entity;

import com.example.healthcare.trackingdbservice.entity.base.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "processing_status_type")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ProcessingStatusTypeEntity extends BaseEntity{

    @Id
    @Column(name = "processing_status_type_cd",length = 120,nullable = false)
    private String processingStatusTypeCD;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "active_bit",nullable = false)
    private int activeBit;
//
//    @OneToMany(mappedBy = "processingStatusTypeEntity", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
//            CascadeType.REFRESH })
//    private List<MessageEntity> messageEntities;
}
