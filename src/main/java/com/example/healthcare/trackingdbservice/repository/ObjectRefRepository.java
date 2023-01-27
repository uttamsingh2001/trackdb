package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.ObjectRefEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRefRepository extends CrudRepository<ObjectRefEntity,Long> {
}
