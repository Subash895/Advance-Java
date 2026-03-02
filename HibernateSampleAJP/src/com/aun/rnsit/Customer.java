package com.aun.rnsit;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "custName")
    private String customerName;

    @Column(name = "custAddress")
    private String customerAddress;

    @Column(name = "custPhone")
    private String customerPhone;

    @Column(name = "purchasevalue")
    private int purchaseValue;

    public Customer() {
    }

    public Customer(String customerName, String customerAddress,
                    String customerPhone, int purchaseValue) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.purchaseValue = purchaseValue;
    }

    public int getId(){
    	return id; 
    	}
    public String getCustomerName() {
    	return customerName; }
    public String getCustomerAddress() { return customerAddress; }
    public String getCustomerPhone() { return customerPhone; }
    public int getPurchaseValue() { return purchaseValue; }

    @Override
    public String toString() {
        return "Customer [id=" + id +
                ", customerName=" + customerName +
                ", customerAddress=" + customerAddress +
                ", customerPhone=" + customerPhone +
                ", purchaseValue=" + purchaseValue + "]";
    }
}