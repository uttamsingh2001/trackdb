package com.example.healthcare.shareddataservice.repository;

import com.example.healthcare.shareddataservice.entity.MessageEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<MessageEntity,Long> {
     MessageEntity findByMessageGuid(String messageGuid);

}
