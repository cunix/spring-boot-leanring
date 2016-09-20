package com.spring.springboot.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	private Integer age;
	private String name;
	private String gender;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public User() {
		super();
	}
	public User(Integer id, Integer age, String name, String gender) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
	
}
