package com.cpc.ghcms.hospitalservice.service;

import com.cpc.ghcms.hospitalservice.dto.HospitalDTO;

public interface HospitalService {
	
	public HospitalDTO getHospital(String secretCode);
	
	public HospitalDTO updateAdminCount(String uniqueID);
	
	public HospitalDTO createHospital(HospitalDTO hospitalDTO);

}
