package com.sam.mongo.repository;

import com.sam.mongo.model.Release;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReleaseRepository extends MongoRepository<Release, String> {
}
