//Write a program to increase the capacity of the ArrayList
//ensureCapacity()

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class IncreaseArrayListCapacity {
	static ArrayList<String> str = new ArrayList<>();
	
	public static void main(String[] args) {
		
		str.add("First");
		str.add("Second");
		
		System.out.println("The list: " + str);
		
		//increasing the capacity
		str.ensureCapacity(4);
		str.add("Third");
		str.add("Fourth");
		
		System.out.println("The list increased: " + str);
		

	}

}
