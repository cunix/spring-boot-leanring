package com.spring.springboot.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.springboot.model.User;

public interface UserMongoRepositoryService extends MongoRepository<User, Integer> {

}
