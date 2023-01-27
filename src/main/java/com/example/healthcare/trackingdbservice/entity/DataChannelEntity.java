package com.example.healthcare.trackingdbservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "data_channel")
@AllArgsConstructor
@NoArgsConstructor
public class DataChannelEntity   {

    @Id
    @Column(name = "data_channel_cd",nullable = false,length = 10)
    private String dataChannelCd;

    @Column(name = "description", length = 255 ,nullable = false)
    private String description;

    @Column(name = "active_bit")
    private int activeBit;

}
