package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address 
{
	@Id
   int addressId;//pk
   int plotNo;
   String street;
   String city;
   String district;
   String state;
   int zip;
   long customerId;//fk
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int addressId, int plotNo, String street, String city, String district, String state, int zip,
		long customerId) {
	super();
	this.addressId = addressId;
	this.plotNo = plotNo;
	this.street = street;
	this.city = city;
	this.district = district;
	this.state = state;
	this.zip = zip;
	this.customerId = customerId;
}
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
}
public int getPlotNo() {
	return plotNo;
}
public void setPlotNo(int plotNo) {
	this.plotNo = plotNo;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
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
public int getZip() {
	return zip;
}
public void setZip(int zip) {
	this.zip = zip;
}
public long getCustomerId() {
	return customerId;
}
public void setCustomerId(long customerId) {
	this.customerId = customerId;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", plotNo=" + plotNo + ", street=" + street + ", city=" + city
			+ ", district=" + district + ", state=" + state + ", zip=" + zip + ", customerId=" + customerId + "]";
}
   
   


}
