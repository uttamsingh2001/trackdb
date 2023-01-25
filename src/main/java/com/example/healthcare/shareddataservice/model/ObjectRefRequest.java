package com.example.healthcare.shareddataservice.model;


import com.example.healthcare.shareddataservice.entity.MessageEntity;
import com.example.healthcare.shareddataservice.entity.NodeTypeEntity;
import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ObjectRefRequest extends BaseRequest{
    private String objectRef;
    private String msgGuid;
    private MessageRequest messageRequest;
    private NodeTypeRequest nodeTypeRequest;

}
