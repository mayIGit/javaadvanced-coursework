//Write a Java program to empty an array list.

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class EmptyArrayList {

	static ArrayList<Integer> intsArr = new ArrayList<>();
	
	public static void main(String[] args) {
	
		intsArr.add(1);
		intsArr.add(2);
		intsArr.add(3);
		intsArr.add(4);
		intsArr.add(5);
		intsArr.add(6);
		intsArr.add(7);
		
		System.out.println("Original Array: " + intsArr);
		
		intsArr.clear();
		
		System.out.println("Original Array, now Empty" + intsArr);

	}

}
