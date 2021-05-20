package com.microservices.microservices.bean;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.hateoas.RepresentationModel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "All details about the user.")
public class User extends RepresentationModel<User> {

	private Integer id;

	@Size(min = 2,message = "Name must have 2 characters.")
	@ApiModelProperty(notes = "Name should have 2 characters atleast.")
	private String name;

	@Past
	@ApiModelProperty(notes = "DOB should ot be future dates.")
	private Date dob;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

	public User(Integer id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	protected User()
	{
		
	}

}
