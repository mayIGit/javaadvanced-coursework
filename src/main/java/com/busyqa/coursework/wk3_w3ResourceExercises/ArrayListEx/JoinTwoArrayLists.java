//Write a Java program to join two array lists.
//Using the ArrayList method addAll() to join the arrays into a new one
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class JoinTwoArrayLists {

	static ArrayList<Character> a = new ArrayList<>();
	static ArrayList<Character> b = new ArrayList<>();
	static ArrayList<Character> abList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		//populate the arrayLists
		
		a.add('A');
		a.add('a');
		
		b.add('B');
		b.add('b');
		
		System.out.println("Original List a: " + a);
		System.out.println("Original List b: " + b);
		
		abList.addAll(a);
		abList.addAll(b);
		
		System.out.println("List ab after addAll() join " + abList);
		
	}

}
