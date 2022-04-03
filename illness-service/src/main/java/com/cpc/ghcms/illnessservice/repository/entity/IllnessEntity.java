package com.cpc.ghcms.illnessservice.repository.entity;

import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.cpc.ghcms.illnessservice.dto.LocationDTO;


@Document(collection = "illness")
public class IllnessEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private String uniqueID;
	private String label;
	private LocationEntity location;
	private List<String> symptoms;
	
	
	public List<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public LocationEntity getLocation() {
		return location;
	}
	public void setLocation(LocationEntity location) {
		this.location = location;
	}
	

	
}
