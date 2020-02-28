//Write a Java program to retrieve an element (at a specified index) 
//from a given array list. 

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class RetrieveFromArrayList {
	
	static ArrayList<String> s = new ArrayList<>();
	

	public static void main(String[] args) {
		
		RetrieveFromArrayList a = new RetrieveFromArrayList();
		
		s.add("sugar");
		s.add("milk");
		s.add("water");
		s.add("tea");
		s.add("biscuits");
		s.add("cookies");
		s.add("puffs");
		
		System.out.println(s);
		
		try {
			int pos = 4;
			String result = a.retrieveInfo(s,pos);
			System.out.println("Result at pos is: " + result);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("The position has to be < " + s.size());
		}
		finally {
			System.out.println(s + " == " + s.size());
		}

	}
	
	String retrieveInfo(ArrayList<String> arr, int indx)
	{
		return arr.get(indx);
	}

}
