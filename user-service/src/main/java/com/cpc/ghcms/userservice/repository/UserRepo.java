package com.cpc.ghcms.userservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cpc.ghcms.userservice.repository.entity.UserEntity;

@Repository
public interface UserRepo extends MongoRepository<UserEntity, String> {
	
	

}
