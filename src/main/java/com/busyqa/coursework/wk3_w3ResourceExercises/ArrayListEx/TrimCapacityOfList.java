//Write a Java program to trim the capacity 
//of an array list the current list size. - trimToSize()

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class TrimCapacityOfList {
	
	static ArrayList<String> ar = new ArrayList<>(20);
	public static void main(String[] args) {
		
		ar.add("Sunday");
		ar.add("Monday");
		ar.add("Tuesday");
		ar.add("Wednesday");
		ar.add("Thursday");
		ar.add("Friday");
		ar.add("Saturday");
	
		
		System.out.println("Original Array: " + ar.toString());
		System.out.println("Trim to size");
		ar.trimToSize();
		System.out.println("Trimmed Array: " + ar.toString());
		
		
	}

}
