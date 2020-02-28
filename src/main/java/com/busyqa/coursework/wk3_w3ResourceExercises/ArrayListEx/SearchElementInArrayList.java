//Write a Java program to search an element in a array list. 
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchElementInArrayList {
	
	static ArrayList<String> stars = new ArrayList<>();
	
	public static void main(String[] args) {
		stars.add("Sitara");
		stars.add("Nakshatra");
		stars.add("Dumtaara");
		stars.add("Tara");
		stars.add("null");
		stars.add("Chamcham");
		
		Scanner say = new Scanner(System.in);
		System.out.println("Please enter string to search in stars");
		
		
		String searchStr = say.nextLine();
		int searchRes = stars.indexOf(searchStr);
		if(searchRes != -1) {
			System.out.println("We found it at position " + searchRes);
			System.out.println(stars.toString());
		}
		else {
			System.out.println("Not in list!");
			System.out.println(stars.toString());
		}
		
		say.close();

	}

}
