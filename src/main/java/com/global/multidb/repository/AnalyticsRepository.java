package com.global.multidb.repository;

import com.global.multidb.model.Analytics;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AnalyticsRepository extends MongoRepository<Analytics, String> {
    @Query(value = "{userId : ?0}")
    Optional<Analytics> findByUserId(String userId);
}
