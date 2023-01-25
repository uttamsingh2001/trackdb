package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.ObjectRefEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectRefRepository extends CrudRepository<ObjectRefEntity,Long> {
}
