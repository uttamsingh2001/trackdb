package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.ActivityTypeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityTypeRepository extends CrudRepository<ActivityTypeEntity,String> {
}
