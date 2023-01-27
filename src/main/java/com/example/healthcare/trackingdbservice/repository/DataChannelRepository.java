package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.DataChannelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataChannelRepository extends CrudRepository<DataChannelEntity,String> {
}
