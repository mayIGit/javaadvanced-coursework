//Write a Java program to create a new array list, 
//add some colors (string) and print out the collection.

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class ColorsArrayList {

	static ArrayList<String> colorsList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		ColorsArrayList obj = new ColorsArrayList();
		
		obj.addColors(colorsList, "blue");
		obj.addColors(colorsList, "pink");
		obj.addColors(colorsList, "grey");
		obj.addColors(colorsList, "purple");
		obj.addColors(colorsList, "maroon");
		obj.addColors(colorsList, "red");
		obj.addColors(colorsList, "peach");
		obj.addColors(colorsList, "olive");
		
		System.out.println(colorsList.toString());
		
		obj.dispColors(colorsList);
		
		
	}
	
	//function to add in colors
	void addColors(ArrayList<String> list, String color) {
		list.add(color);
	}
	
	//function to print out the list
	void dispColors(ArrayList<String> list) {
		for(String color : list) {
			System.out.println(color);
		}
	}

}
