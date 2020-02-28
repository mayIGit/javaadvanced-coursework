//Write a Java program to reverse elements in a array list.
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	static ArrayList<String> str = new ArrayList<>();
	
	public static void main(String[] args) {
		
		str.add("Bathe");
		str.add("Brush");
		str.add("Dress");
		str.add("Eat");
		
		System.out.println("Original List: " + str.toString());
		
		Collections.reverse(str);
		
		System.out.println("Reversed List: " + str.toString());

	}

}
