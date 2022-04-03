package com.cpc.ghcms.vaccinationservice.repo.entity;

public class IllnessSubset {

	private String illnessId;
	private String label;
	public IllnessSubset(String illnessId, String label) {
		super();
		this.illnessId = illnessId;
		this.label = label;
	}
	public String getIllnessId() {
		return illnessId;
	}
	public void setIllnessId(String illnessId) {
		this.illnessId = illnessId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
