package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.ActivityTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTypeRepository extends CrudRepository<ActivityTypeEntity,String> {
}
