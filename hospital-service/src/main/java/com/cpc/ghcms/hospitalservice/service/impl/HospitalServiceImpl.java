package com.cpc.ghcms.hospitalservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpc.ghcms.hospitalservice.dto.HospitalDTO;
import com.cpc.ghcms.hospitalservice.model.exception.SecretCodeNotValidException;
import com.cpc.ghcms.hospitalservice.repository.HospitalRepo;
import com.cpc.ghcms.hospitalservice.repository.entity.HospitalEntity;
import com.cpc.ghcms.hospitalservice.service.HospitalService;
import com.cpc.ghcms.hospitalservice.service.mapper.HospitalMapper;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	private HospitalRepo hospitalRepo;
	
	@Autowired
	public HospitalMapper hospitalMapper;

	@Override
	public HospitalDTO getHospital(String secretCode) {
		HospitalEntity hE = hospitalRepo.findBySecretCode(secretCode);
		if(hE.getCount() > hE.getNumberOfPeople()) {
			return hospitalMapper.mapHospitalEntityToDTO(hospitalRepo.findBySecretCode(secretCode));
		} else {
			throw new SecretCodeNotValidException("Code has been used "+hE.getCount()+" times.");
		}
	}

	@Override
	public HospitalDTO updateAdminCount(String uniqueID) {
		HospitalEntity hE = hospitalRepo.findByUniqueID(uniqueID);
		if(hE != null && hE.getCount() > hE.getNumberOfPeople()) {
			hE.setNumberOfPeople(hE.getNumberOfPeople()+1);
			return hospitalMapper.mapHospitalEntityToDTO(hospitalRepo.save(hE));
		} else {
			throw new SecretCodeNotValidException("Code is not valid.");
		}
	}

	@Override
	public HospitalDTO createHospital(HospitalDTO hospitalDTO) {
		return hospitalMapper.mapHospitalEntityToDTO(hospitalRepo.save(hospitalMapper.mapHospitalDTOToEntity(hospitalDTO)));
	}

}
