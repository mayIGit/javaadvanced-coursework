//Write a Java program to copy one array list into another.
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class CopyOneListToAnother {
	
	static ArrayList<String> ar1 = new ArrayList<>();
	static ArrayList<String> ar2 = new ArrayList<>();
	
	public static void main(String[] args) {
		ar1.add("sand");
		ar1.add("sea");
		ar1.add("shells");
		
		ar2.add("she");
		ar2.add("sells");
		ar2.add("shells");
		
		System.out.println(ar1);
		System.out.println(ar2);
		
		Collections.copy(ar1, ar2);
		
		System.out.println("After copy!");
		System.out.println(ar1);
		System.out.println(ar2);

	}
	
	
	
}
