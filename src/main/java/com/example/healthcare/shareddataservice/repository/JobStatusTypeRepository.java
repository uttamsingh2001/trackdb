package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.JobStatusTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobStatusTypeRepository extends CrudRepository<JobStatusTypeEntity,String> {
}
