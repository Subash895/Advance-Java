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
	@Column(name= "studName")
	String studName;
	@Column(name="StudAdress")
	String StudAdress;
	
	


}
