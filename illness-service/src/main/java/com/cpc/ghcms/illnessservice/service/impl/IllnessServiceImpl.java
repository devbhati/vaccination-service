package com.cpc.ghcms.illnessservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cpc.ghcms.illnessservice.dto.IllnessDTO;
import com.cpc.ghcms.illnessservice.repository.IllnessRepo;
import com.cpc.ghcms.illnessservice.repository.entity.IllnessEntity;
import com.cpc.ghcms.illnessservice.service.IllnessService;
import com.cpc.ghcms.illnessservice.service.mapper.IllnessMapper;



@Service
public class IllnessServiceImpl implements IllnessService {
	
	@Autowired
	private IllnessRepo illnessRepo;
	
	@Autowired
	public IllnessMapper illnessMapper;

	@Override
	public IllnessDTO reportIllness(IllnessDTO illnessDTO) {
		IllnessEntity illnessEntity = illnessMapper.mapIllnessDTOToEntity(illnessDTO);
		return illnessMapper.mapIllnessEntityToDTO(illnessRepo.save(illnessEntity));
	}

	@Override
	public List<IllnessDTO> getAllIllness() {
		return illnessMapper.mapListIllnessEntitytoDTO(illnessRepo.findAll());
	}

}
