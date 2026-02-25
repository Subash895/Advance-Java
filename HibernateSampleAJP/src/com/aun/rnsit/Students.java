package com.aun.rnsit;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name = "Students")
public class Students {

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

    public Students() {
    }

    // Constructor with parameters
    public Students(String studName, String stdAdress, String stdCourse, String stdEmail) {
        this.studName = studName;
        this.stdAdress = stdAdress;
        this.stdCourse = stdCourse;
        this.stdEmail = stdEmail;
    }

    // Getters and Setters
}