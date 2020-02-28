package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx.PersonPack;

import java.util.Arrays;

public class Person {
	
	//Instance Variables
	
	String fname;
	String lname;
	Integer age;
	String[] hobbies;
	Boolean employed;
	
	//Paramatized constructor
	public Person(
			String fname, String lname, 
			Integer age, String[] hobbies, 
			Boolean employed) 
		{	
				this.fname = fname;
				this.lname = lname;
				this.age = age;
				this.hobbies = hobbies;
				this.employed = employed;
		}
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Boolean getEmployed() {
		return employed;
	}

	public void setEmployed(Boolean employed) {
		this.employed = employed;
	}



	@Override
	public String toString() {
		return "Person [fname=" + fname + ", lname=" + lname + ", age=" + age + ", hobbies=" + Arrays.toString(hobbies)
				+ ", employed=" + employed + "]";
	}
	
	
	
	
	
	
	

}
