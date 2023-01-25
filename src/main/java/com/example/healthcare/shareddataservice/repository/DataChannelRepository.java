package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.DataChannelEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataChannelRepository extends CrudRepository<DataChannelEntity,String> {
}
