package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.NodeTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NodeTypeRepository extends CrudRepository<NodeTypeEntity,String> {
}
