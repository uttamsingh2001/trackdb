package com.example.healthcare.shareddataservice.entity;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "activity_type")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ActivityTypeEntity extends BaseEntity   {
    @Id
    @Column(name = "activity_type_cd",length = 120,nullable = false)
    private String activityTypeCd;
    @Column(name = "description", length = 255)
    private String description;
    @Column(name = "active_bit",nullable = false)
    private int activeBit;

}
