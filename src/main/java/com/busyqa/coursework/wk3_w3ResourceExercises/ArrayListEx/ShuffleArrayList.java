//Write a program to shuffle elements in an arrayList
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;
public class ShuffleArrayList {

	static ArrayList<Integer> numList = new ArrayList<>();
	
	public static void main(String[] args) {
		
		numList.add(0);
		numList.add(10);
		numList.add(20);
		numList.add(30);
		numList.add(40);
		numList.add(50);
		numList.add(60);
		
		System.out.println("Original List" + numList.toString());
		
		Collections.shuffle(numList);
		
		System.out.println("Shuffled List" + numList.toString());
		

	}

}
