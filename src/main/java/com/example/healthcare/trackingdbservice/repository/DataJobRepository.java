package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.DataJobEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataJobRepository extends CrudRepository<DataJobEntity,Long> {
    DataJobEntity findByDataJobGuid(String dataJobGuid);
}
