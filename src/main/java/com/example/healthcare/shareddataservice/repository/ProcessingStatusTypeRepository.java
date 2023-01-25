package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.ProcessingStatusTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessingStatusTypeRepository extends CrudRepository<ProcessingStatusTypeEntity,String> {
}
