package com.org;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder={"CustomerId","CustomerName","age"})
public class customer {
	private int CustomerId;
	private String CustomerName;
	private int age;
	public customer(int customerId, String customerName, int age) {
		super();
		CustomerId = customerId;
		CustomerName = customerName;
		this.age = age;
	}
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
