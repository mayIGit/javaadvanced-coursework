package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx.PersonPack;

public class Main {

	public static void main(String[] args) {
		
		Dependent one = 
				new Dependent(
						"Sheela", 
						"D'Souza", 
						34,
						new String[]{"Cooking","Sewing"}, 
						true, 
						"spouse");
		
		System.out.println(one);
		
}
}
