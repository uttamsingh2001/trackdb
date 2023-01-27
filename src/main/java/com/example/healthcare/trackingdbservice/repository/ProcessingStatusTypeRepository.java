package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.ProcessingStatusTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingStatusTypeRepository extends CrudRepository<ProcessingStatusTypeEntity,String> {
}
