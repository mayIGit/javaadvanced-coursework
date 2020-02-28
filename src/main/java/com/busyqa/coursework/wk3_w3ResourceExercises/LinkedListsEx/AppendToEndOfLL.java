//Write a Java program to append the specified element to the end of a linked list. 

package com.busyqa.coursework.wk3_w3ResourceExercises.LinkedListsEx;

import java.util.LinkedList;

public class AppendToEndOfLL {
	static LinkedList<String> sixMths = new LinkedList<>();
	public static void main(String[] args) {
		
		sixMths.add("January");
		sixMths.add("February");
		sixMths.add("March");
		sixMths.add("April");
		sixMths.add("May");
		
		System.out.println("Original List" + sixMths);
		sixMths.add(sixMths.size(),"June");
		System.out.println("June added to end of List" + sixMths);
		

	}

}
