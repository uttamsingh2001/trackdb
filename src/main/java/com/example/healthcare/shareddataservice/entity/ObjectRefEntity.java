package com.example.healthcare.shareddataservice.entity;


import com.example.healthcare.shareddataservice.entity.base.BaseEntity;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "object_ref")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ObjectRefEntity  extends BaseEntity{

    @Id
    @SequenceGenerator(name = "object_ref_id", sequenceName = "object_ref_id",initialValue = 1000,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "object_ref_id")
    @Column(name = "object_ref_id",nullable = false)
    private Long objectRefID;

    @Column(name = "object_ref", length = 200,nullable = false)
    private String objectRef;
    @Column(name = "msg_guid",length = 38,nullable = false)
    private String msgGuid;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "msg_id", nullable = false)
    private MessageEntity messageEntity;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "node_type", nullable = false)
    private NodeTypeEntity nodeTypeEntity;

}
