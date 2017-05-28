package com.java.functional.filter.model;

public class Employee {
	private Integer id;
	private String name;
	private String designation;
	private Integer age;

	public Employee(Integer id, String name, String designation, Integer age) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.age = age;
	}

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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return String
				.format("{ %d - %s - %s - %d}", id, name, designation, age);
	}
}
