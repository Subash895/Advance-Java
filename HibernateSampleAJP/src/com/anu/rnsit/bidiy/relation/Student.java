package com.anu.rnsit.bidiy.relation;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="email")
	private String emailId;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="StdAdressis")
	private Address StdAddress;


	public Student(int id, String firstName, String lastName, String emailId, Address stdAddress) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		StdAddress = stdAddress;
	}


	public Student(String firstName, String lastName, String emailId, Address stdAddress) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		StdAddress = stdAddress;
	}


	public Student(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Student [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", StdAddress=" + StdAddress + "]";
	}


	public Student() {
		super();
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public Address getStdAddress() {
		return StdAddress;
	}


	public void setStdAddress(Address stdAddress) {
		StdAddress = stdAddress;
	}
	
	
	
	
}
