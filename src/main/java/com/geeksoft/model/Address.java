package com.geeksoft.model;

public class Address {
	private int buildingNumber;
	private String streetName;
	private String city;
	private String state;
	private String zip;
	
	public Address(int buildingno, String streetName, String city, String state, String zip) {
	setBuildingNumber(buildingno);
	this.setStreetName(streetName);
	this.setCity(city);
	this.setState(state);
	this.setZip(zip);
		
	}

	public int getBuildingNumber() {
		return buildingNumber;
	}

	public void setBuildingNumber(int buildingNumber) {
		this.buildingNumber = buildingNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}
