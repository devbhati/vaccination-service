package com.cpc.ghcms.illnessservice.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cpc.ghcms.illnessservice.repository.entity.IllnessEntity;

@Repository
public interface IllnessRepo extends MongoRepository<IllnessEntity, String> {
	
}
