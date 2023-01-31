package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.ActivityEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ActivityRepository extends CrudRepository<ActivityEntity, Long> {
//    @Query(value = "select m.messageGuid,a.activityName,a.ActivityType,a.processingStatusTypeCd from ActivityEntity a join MessageEntity m on a.msgId = m.msgId where m.msgId=?1")

//    @Query(value = "Select m.msgGuid from MessageEntity m join ActivityEntity a on m.msgId = a.messageEntity where m.msgId=?1 ", nativeQuery = true)

    @Query(value = "select m.message_guid,a.activity_name,a.activity_type,a.processing_status_type_cd from activity a join msg m on a.msg_id = m.msg_id where m.msg_id=1000",nativeQuery = true)
    Optional<ActivityEntity> findByMsgId(Long msgId);

//   @Query(value = "select a from ActivityEntity a Left join Fetch a.messageEntity where a.messageEntity.msgId=?1")
}
