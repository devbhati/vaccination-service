package com.cpc.ghcms.vaccinationservice.repo.entity;

public class Location {
	
	private String addressLine1;
	private String addressLine2;
	private String country;
	private String state;
	private String city;
	private String locationId;
	private String zip;
	private String geoLocation;
	
	
	public Location(String addressLine1) {
		super();
		this.addressLine1 = addressLine1;
	}

	public Location(String addressLine1, String addressLine2, String country, String state, String city,
			String locationId, String zip, String geoLocation) {
		super();
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.country = country;
		this.state = state;
		this.city = city;
		this.locationId = locationId;
		this.zip = zip;
		this.geoLocation = geoLocation;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getGeoLocation() {
		return geoLocation;
	}

	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
