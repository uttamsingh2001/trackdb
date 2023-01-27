package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity,Long> {
     MessageEntity findByMessageGuid(String messageGuid);

}
