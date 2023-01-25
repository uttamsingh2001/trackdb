package com.example.healthcare.shareddataservice.model;

import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DataChannelRequest extends BaseRequest   {
    private String dataChannelCd;
    private String description;
    private int activeBit;

}
