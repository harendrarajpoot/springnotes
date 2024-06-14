package com.spring;

public class Address {

	
	private int houseNo;
	private String street;
	private String landmark;
	
	private int pincode;
	private String district;
	private String state;
	private String country;
	
	
	
	
	public Address(int houseNo, String street, String landmark, int pincode, String district, String state,
			String country) {
		super();
		this.houseNo = houseNo;
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
		this.district = district;
		this.state = state;
		this.country = country;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
