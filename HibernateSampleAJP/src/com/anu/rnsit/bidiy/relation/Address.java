package com.anu.rnsit.bidiy.relation;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="State")
	private String State;
	
	@Column(name="City")
	private String City;
	
	@OneToOne(mappedBy="StdAddress",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Student StdDetail;

	public Address(int id, String state, String city, Student stdDetail) {
		super();
		this.id = id;
		State = state;
		City = city;
		StdDetail = stdDetail;
	}

	public Address(String state, String city, Student stdDetail) {
		super();
		State = state;
		City = city;
		StdDetail = stdDetail;
	}

	public Address() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Student getStdDetail() {
		return StdDetail;
	}

	public void setStdDetail(Student stdDetail) {
		StdDetail = stdDetail;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", State=" + State + ", City=" + City + ", StdDetail=" + StdDetail + "]";
	}
	
	
}
