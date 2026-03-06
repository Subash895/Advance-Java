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
@Table(name="project")
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int Id;
	
	@Column(name="project_name")
	private String ProjectName;
	
	@ManyToMany(mappedBy="projects")
	private Set<Employee> employees=new HashSet<Employee>();

	
	public Project(String projectName, Set<Employee> employees) {
		super();
		ProjectName = projectName;
		this.employees = employees;
	}

	public Project() {
		super();
	}

	public Project(int id, String projectName, Set<Employee> employees) {
		super();
		Id = id;
		ProjectName = projectName;
		this.employees = employees;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getProjectName() {
		return ProjectName;
	}

	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}

	public Set<Employee> getEmployees() {
		return employees;
	}

	public Project(String projectName) {
		super();
		ProjectName = projectName;
	}

	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
}
