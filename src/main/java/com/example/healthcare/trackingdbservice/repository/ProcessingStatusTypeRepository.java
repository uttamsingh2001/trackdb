package com.example.healthcare.trackingdbservice.repository;

import com.example.healthcare.trackingdbservice.entity.ProcessingStatusTypeEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProcessingStatusTypeRepository extends CrudRepository<ProcessingStatusTypeEntity,String> {
////    @Query(value = "select p from ProcessingStatusTypeEntity p join p.messageEntity m where m.dataJobGUID=?1 ")
//
////    @Query(value = "select m.dataJobGuid,m.processingStatusType from messageEntity m full join processingStatusTypeEntity p on p.processingStatusTypeCD = m.processingStatusTypeCD where m.dataJobGuid=?1")
//    Optional<ProcessingStatusTypeEntity> findByDataJobGuid(String dataJobGuid);

}
