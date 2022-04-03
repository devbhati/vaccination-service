package com.cpc.ghcms.hospitalservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cpc.ghcms.hospitalservice.repository.entity.HospitalEntity;


@Repository
public interface HospitalRepo extends MongoRepository<HospitalEntity, String>  {
	 
	public HospitalEntity findBySecretCode(String secretCode);
	public HospitalEntity findByUniqueID(String uniqueID);

}
