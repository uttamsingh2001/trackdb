package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.JobStatusTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobStatusTypeRepository extends CrudRepository<JobStatusTypeEntity,String> {
}
