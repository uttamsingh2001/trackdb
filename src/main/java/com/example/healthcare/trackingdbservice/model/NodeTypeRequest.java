package com.example.healthcare.trackingdbservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NodeTypeRequest extends BaseRequest{
    private String nodeTypeCD;
    private String description;
    private int activeBit;

}
