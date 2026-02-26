package com.arun.rns;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "Students")
public class StudentsTab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Studentid")
    private int studentId;

    @Column(name = "StudName")
    private String studName;

    @Column(name = "stdAdress")
    private String stdAdress;

    @Column(name = "stdCourse")
    private String stdCourse;

    @Column(name = "stdEmail")
    private String stdEmail;

    public StudentsTab() {
    }

    // Constructor with parameters
    public StudentsTab(String studName, String stdAdress, String stdCourse, String stdEmail) {
        this.studName = studName;
        this.stdAdress = stdAdress;
        this.stdCourse = stdCourse;
        this.stdEmail = stdEmail;
    }

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStdAdress() {
		return stdAdress;
	}

	public void setStdAdress(String stdAdress) {
		this.stdAdress = stdAdress;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	@Override
	public String toString() {
		return "StudentsTab [studentId=" + studentId + ", studName=" + studName + ", stdAdress=" + stdAdress
				+ ", stdCourse=" + stdCourse + ", stdEmail=" + stdEmail + "]";
	}
	
    // Getters and Setters
    
}