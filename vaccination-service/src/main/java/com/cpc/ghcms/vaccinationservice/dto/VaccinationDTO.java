package com.cpc.ghcms.vaccinationservice.dto;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cpc.ghcms.vaccinationservice.repo.entity.IllnessSubset;
import com.cpc.ghcms.vaccinationservice.repo.entity.VaccinationDrive;

@Document(collection = "vaccination")
public class VaccinationDTO {
	
	@Id
	private String vaccinationId;
	private List<IllnessSubset> illnesses;
	private List<VaccinationDrive> vaccinationDrives;
	public VaccinationDTO(String vaccinationId, List<IllnessSubset> illnesses, List<VaccinationDrive> vaccinationDrives) {
		super();
		this.vaccinationId = vaccinationId;
		this.illnesses = illnesses;
		this.vaccinationDrives = vaccinationDrives;
	}
	public String getVaccinationId() {
		return vaccinationId;
	}
	public void setVaccinationId(String vaccinationId) {
		this.vaccinationId = vaccinationId;
	}
	public List<IllnessSubset> getIllnesses() {
		return illnesses;
	}
	public void setIllnesses(List<IllnessSubset> illnesses) {
		this.illnesses = illnesses;
	}
	public List<VaccinationDrive> getVaccinationDrives() {
		return vaccinationDrives;
	}
	public void setVaccinationDrives(List<VaccinationDrive> vaccinationDrives) {
		this.vaccinationDrives = vaccinationDrives;
	
}
}
