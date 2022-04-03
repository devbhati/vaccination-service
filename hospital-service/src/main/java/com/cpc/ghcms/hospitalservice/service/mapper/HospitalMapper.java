package com.cpc.ghcms.hospitalservice.service.mapper;
import org.mapstruct.Mapper;
import com.cpc.ghcms.hospitalservice.dto.HospitalDTO;
import com.cpc.ghcms.hospitalservice.dto.LocationDTO;
import com.cpc.ghcms.hospitalservice.repository.entity.HospitalEntity;
import com.cpc.ghcms.hospitalservice.repository.entity.LocationEntity;

@Mapper
public interface HospitalMapper {
	
	public HospitalEntity mapHospitalDTOToEntity(HospitalDTO hospitalDTO);
	public HospitalDTO mapHospitalEntityToDTO(HospitalEntity hospitalEntity);
	public LocationEntity mapLocationDTOToEntity(LocationDTO locationDTO);
	public LocationDTO mapLocationEntityToDTO(LocationEntity locationEntity);

}
