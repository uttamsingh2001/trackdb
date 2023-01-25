package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.ActivityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityRepository extends CrudRepository<ActivityEntity,Long> {
}
