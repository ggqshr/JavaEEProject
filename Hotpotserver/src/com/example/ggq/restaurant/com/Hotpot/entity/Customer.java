package com.example.ggq.restaurant.com.Hotpot.entity;

import java.io.Serializable;

public class Customer implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = -9148742680752719866L;
private String customerNumber;
private String customerPass;
private String customerName;
private String customerSex;
private String customerPhone;
private float waiterMoney;
public float getWaiterMoney() {
	return waiterMoney;
}
public void setWaiterMoney(float waiterMoney) {
	this.waiterMoney = waiterMoney;
}
public Customer() {
	// TODO Auto-generated constructor stub
}
public String getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(String customerNumber) {
	this.customerNumber = customerNumber;
}
public String getCustomerPass() {
	return customerPass;
}
public void setCustomerPass(String customerPass) {
	this.customerPass = customerPass;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerSex() {
	return customerSex;
}
public void setCustomerSex(String customerSex) {
	this.customerSex = customerSex;
}
public String getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}

}
