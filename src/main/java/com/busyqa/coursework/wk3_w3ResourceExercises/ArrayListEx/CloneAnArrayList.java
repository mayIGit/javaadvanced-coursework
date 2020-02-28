//Write a Java program to clone an array list to another array list.
//clone()

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class CloneAnArrayList {
	
	static ArrayList<Double> doubList = new ArrayList<>();
	static ArrayList<Double> doubListClone = new ArrayList<>();

	public static void main(String[] args) {
		
		doubList.add(10.25);
		doubList.add(15.40);
		doubList.add(20.20);
		
		doubListClone = (ArrayList<Double>) doubList.clone();
		
		System.out.println("Original List: " + doubList);
		System.out.println("Cloned List: " + doubListClone);
		

	}

}
