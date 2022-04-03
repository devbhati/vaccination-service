package com.cpc.ghcms.vaccinationservice.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.cpc.ghcms.vaccinationservice.dto.LocationDto;
import com.cpc.ghcms.vaccinationservice.dto.SlotDto;
import com.cpc.ghcms.vaccinationservice.dto.TimelineDto;
import com.cpc.ghcms.vaccinationservice.dto.VaccinationDriveDTO;
import com.cpc.ghcms.vaccinationservice.repo.entity.Location;
import com.cpc.ghcms.vaccinationservice.repo.entity.Slot;
import com.cpc.ghcms.vaccinationservice.repo.entity.Timeline;
import com.cpc.ghcms.vaccinationservice.repo.entity.VaccinationDrive;

@Mapper
public interface VaccinationDriveMapper {

	public List<VaccinationDriveDTO> mapVaccinationDriveEntityToDtoList(List<VaccinationDrive> vaccinationDrive);
	public LocationDto mapLocationEntityToDto(Location location);
	public TimelineDto mapLocationEntityToDto(Timeline timeline);
	public SlotDto mapLocationEntityToDto(Slot slot);
}
