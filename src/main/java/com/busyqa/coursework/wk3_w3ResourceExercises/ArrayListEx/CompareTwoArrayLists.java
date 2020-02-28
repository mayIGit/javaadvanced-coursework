//Write a program to compare two ArrayLists
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class CompareTwoArrayLists {
	
	static ArrayList<String> list1 = new ArrayList<>();
	static ArrayList<String> list2 = new ArrayList<>();
	
	public static void main(String[] args) {
		list1.add("roses");
		list1.add("are");
		list1.add("red");
		
		list2.add("roses");
		list2.add("are");
		list2.add("red");
		
		//Step1 sort the two lists
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		System.out.println("Sorted List 1: " + list1);
		System.out.println("Sorted List 2: " + list2);
		
		//Step two - check if they are equal
		
		if(list1.equals(list2))
		{
			System.out.println("Yes they are same!");
		}
		else
		{
			System.out.println("No They are different");
		}

	}

}
