package com.cpc.ghcms.illnessservice.service;

import java.util.List;

import com.cpc.ghcms.illnessservice.dto.IllnessDTO;
import com.cpc.ghcms.illnessservice.repository.entity.IllnessEntity;

public interface IllnessService {	
	
	public IllnessDTO reportIllness(IllnessDTO userDTO);
	
	public List<IllnessDTO> getAllIllness();

}
