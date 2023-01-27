package com.example.healthcare.trackingdbservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

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
