package com.microservices.microservices.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FilteringBean {

	private String name;
	@JsonIgnore
	private Integer id;
	private String address;
	@Override
	public String toString() {
		return "FilteringBean [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public FilteringBean(String name, Integer id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	
	
	
}
