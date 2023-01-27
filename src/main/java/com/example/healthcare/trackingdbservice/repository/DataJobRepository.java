package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.DataJobEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DataJobRepository extends CrudRepository<DataJobEntity,Long> {
    Optional<DataJobEntity> findByDataJobGuid(String dataJobGuid);
}
