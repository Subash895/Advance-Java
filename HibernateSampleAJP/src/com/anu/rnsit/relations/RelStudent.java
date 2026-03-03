package com.anu.rnsit.relations;

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
public class RelStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="email")
	private String Email;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private RelAddress studentAddress;
	
	public RelStudent() {
		
	}
	public RelStudent(String firstName, String lastName, String email) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
	}
	@Override
	public String toString() {
		return "RelStudent [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + Email
				+ ", studentAddress=" + studentAddress + "]";
	}

	public RelStudent(String email, RelAddress studentAddress) {
		super();
		Email = email;
		this.studentAddress = studentAddress;
	}

	public RelStudent(String firstName, String lastName, String email, RelAddress studentAddress) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.studentAddress = studentAddress;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public RelAddress getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(RelAddress studentAddress) {
		this.studentAddress = studentAddress;
	}
	
}
