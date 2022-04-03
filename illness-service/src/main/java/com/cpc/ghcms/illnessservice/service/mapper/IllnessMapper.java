package com.cpc.ghcms.illnessservice.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.cpc.ghcms.illnessservice.dto.IllnessDTO;
import com.cpc.ghcms.illnessservice.dto.LocationDTO;
import com.cpc.ghcms.illnessservice.repository.entity.IllnessEntity;
import com.cpc.ghcms.illnessservice.repository.entity.LocationEntity;

@Mapper
public interface IllnessMapper {
	
	public IllnessEntity mapIllnessDTOToEntity(IllnessDTO illnessDTO);
	public IllnessDTO mapIllnessEntityToDTO(IllnessEntity illnessEntity);
	public List<IllnessDTO> mapListIllnessEntitytoDTO(List<IllnessEntity> illnessEntity);
	public LocationEntity mapLocationDTOToEntity(LocationDTO locationDTO);
	public LocationDTO mapLocationEntityToDTO(LocationEntity locationEntity);

}
