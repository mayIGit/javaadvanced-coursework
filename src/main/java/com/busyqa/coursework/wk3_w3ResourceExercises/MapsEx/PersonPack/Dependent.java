package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx.PersonPack;

import java.util.Arrays;

public class Dependent extends Person{

	String relationship;
	
	
	//constructor + super constructor reference
	public Dependent(
			String fname, 
			String lname, 
			Integer age, 
			String[] hobbies, 
			Boolean employed, 
			String relationship
		) {
		super(fname, lname, age, hobbies, employed);
		this.relationship = relationship;
		
	}


	//getters and setters
	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	


	@Override
	public String toString() {
		return "Dependent [relationship=" + relationship + ", fname=" + fname + ", lname="
				+ lname + ", age=" + age + ", hobbies=" + Arrays.toString(hobbies) + ", employed=" + employed + "]";
	}
	
	
	
	
}
