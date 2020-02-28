//Write a Java program to test an array list is empty or not.
//isEmpty()

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class TestEmptyArrayList {
	static ArrayList<String> emptyList= new ArrayList<>();
	
	public static void main(String[] args) {
		
		if(emptyList.isEmpty() == true)
			{
			System.out.println("You have an empty ArrayList: " + emptyList);
			}
			else
			{
				System.out.println("Array not empty: " + emptyList);
			}
	}

}
