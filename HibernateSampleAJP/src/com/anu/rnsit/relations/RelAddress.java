package com.anu.rnsit.relations;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class RelAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name= "cityName")
	private String cityName;
	
	@Column(name="StateName")
	private String stateName;
	
	
	public RelAddress(int id, String cityName, String stateName) {
		super();
		Id = id;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public RelAddress() {
		super();
	}

	public RelAddress(String cityName, String stateName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
	}
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

}
