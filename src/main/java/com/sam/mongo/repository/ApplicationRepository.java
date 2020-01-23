package com.sam.mongo.repository;

import com.sam.mongo.model.Application;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ApplicationRepository extends MongoRepository<Application, String>{
}
