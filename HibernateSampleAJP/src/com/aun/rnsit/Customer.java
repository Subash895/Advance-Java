package com.aun.rnsit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customer {

    @Id // Primary Key
    @GeneratedValue(strategy=GenerationType.IDENTITY) // Auto Generated Field
    @Column(name="id")
    int id;

    @Column(name="custName")
    String customerName;

    @Column(name="custAddress")
    String customerAddress;

    @Column(name="custPhone")
    String customerPhone;

    @Column(name="purchasevalue")
    int purchaseValue;

    
    
	public Customer(int id, String customerName, String customerAddress, String customerPhone, int purchaseValue) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.purchaseValue = purchaseValue;
	}

	public Customer() {
	}

	public Customer(String customerName, String customerAddress) {
		super();
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public String getCustomerPhone() {
		return customerPhone;
	}



	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}



	public int getPurchaseValue() {
		return purchaseValue;
	}



	public void setPurchaseValue(int purchaseValue) {
		this.purchaseValue = purchaseValue;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", customerPhone=" + customerPhone + ", purchaseValue=" + purchaseValue + "]";
	}
    
    
}

