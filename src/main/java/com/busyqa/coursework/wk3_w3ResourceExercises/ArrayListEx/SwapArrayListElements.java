//Write a Java program of swap two elements in an array list.
//Swapping can be achieved by using the Collections.swap method

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayListElements {

	static ArrayList<Integer> nums = new ArrayList<>();
	
	public static void main(String[] args) {
		nums.add(100);
		nums.add(102);
		nums.add(500);
		nums.add(625);
		nums.add(1);
		
		System.out.println("List of numbers: " + nums);
		System.out.println("Swapping 500 and 625");
		
		Collections.swap(nums, 2, 3);
		
		System.out.println("Swapped List: " + nums.toString());

	}

}
