//Write a Java program to iterate through all elements in a array list.

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class IterateThroughArrList {

	//create new ArrayList
	static ArrayList<Integer> intList = new ArrayList<>();
	public static void main(String[] args) {
		
		//populate the list
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		intList.add(6);
		
		//iterate through ArrayList and display contents
		
		for(int x : intList) {
			System.out.println(x);
		}
		

	}

}
