package com.MyFirstHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Dev_Engineer")
public class DevEngineer {
	@Id
	@Column(name="D_Id")
	private int id;
	
	@Column(name="D_Name")
	private String name;
	
	@Column(name="D_Salary")
	private double salary;
	
	@Column(name="D_Age")
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*
	 * public DevEngineer(int id, String name, double salary, int age) { this.id =
	 * id; this.name = name; this.salary = salary; this.age = age; }
	 */
	
	

}
