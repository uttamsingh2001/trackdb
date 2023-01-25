package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.DataJobEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataJobRepository extends CrudRepository<DataJobEntity,Long> {
    DataJobEntity findByDataJobGuid(String dataJobGuid);
}
