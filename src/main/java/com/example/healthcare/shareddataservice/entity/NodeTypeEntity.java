package com.example.healthcare.shareddataservice.entity;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "node_type")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class NodeTypeEntity extends BaseEntity{

    @Id
    @Column(name = "node_type_cd",length = 120,nullable = false)
    private String nodeTypeCD;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "active_bit",nullable = false)
    private int activeBit;

}
