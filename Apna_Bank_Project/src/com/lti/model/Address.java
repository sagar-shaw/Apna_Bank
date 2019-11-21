package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addr_seq")
	@SequenceGenerator(sequenceName = "accholder_addr_seq", name = "addr_seq", allocationSize = 1)
   int addressId;//pk
	
   int plotNo;
   String street;
   String city;
   String district;
   String state;
   int zip;
   
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(int addressId, int plotNo, String street, String city, String district, String state, int zip) 
{
	super();
	this.addressId = addressId;
	this.plotNo = plotNo;
	this.street = street;
	this.city = city;
	this.district = district;
	this.state = state;
	this.zip = zip;

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


@Override
public String toString() {
	return "Address [addressId=" + addressId + ", plotNo=" + plotNo + ", street=" + street + ", city=" + city
			+ ", district=" + district + ", state=" + state + ", zip=" + zip + "]";
}
   
   


}
