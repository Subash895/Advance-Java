package com.greatlearnig.entity;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.processing.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee {
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
	
	@ManyToMany(fetch=FetchType.LAZY,cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinTable(name="employee_project",
	joinColumns=@JoinColumn(name="employee_id"),
	inverseJoinColumns=@JoinColumn(name="project_id")
			)
	private Set<Project> projects=new HashSet<Project>();
	
	
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


	public Set<Project> getProjects() {
		return projects;
	}


	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}


	public Employee(int id, String emailId, Set<Project> projects) {
		super();
		Id = id;
		this.emailId = emailId;
		this.projects = projects;
	}


	public Employee(int id, String firstName, String lastName, String emailId, Set<Project> projects) {
		super();
		Id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.projects = projects;
	}


	public Employee(String string, String string2, String string3, String string4) {
		super();
	}


	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", projects=" + projects + "]";
	}
}
