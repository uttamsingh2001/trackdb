package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.NodeTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeTypeRepository extends CrudRepository<NodeTypeEntity,String> {
}
