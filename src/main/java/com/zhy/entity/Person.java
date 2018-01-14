package com.zhy.entity;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware{
	private String id;
	private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public void setBeanName(String name) {
		this.id = name;
	}
	
	
}
