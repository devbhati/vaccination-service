package com.cpc.ghcms.vaccinationservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cpc.ghcms.vaccinationservice.repo.entity.VaccinationDrive;

@Repository
public interface VaccinationDriveRepo extends MongoRepository<VaccinationDrive, String>{
	
	public List<VaccinationDrive> findByLocationZip(String zip);

}
