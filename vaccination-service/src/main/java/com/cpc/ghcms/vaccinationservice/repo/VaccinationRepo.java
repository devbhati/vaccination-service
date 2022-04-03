package com.cpc.ghcms.vaccinationservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cpc.ghcms.vaccinationservice.repo.entity.Vaccination;

@Repository
public interface VaccinationRepo extends MongoRepository<Vaccination, String>{
	
	public Vaccination findByIllnessesIllnessId(String illnessId);

}
