package com.JPQLexample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_entity")
public class Student {
	@Id
	private int s_id;
	private String s_name;
	private int s_age;
	
	
	public Student(int s_id, String s_name, int age, int s_age) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_age = s_age;
	}
	
	
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int age) {
		this.s_age = age;
	}
	
	
	

}
