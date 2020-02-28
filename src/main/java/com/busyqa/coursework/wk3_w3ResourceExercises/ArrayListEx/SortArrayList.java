//write a program to sort an arrayList
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
	static ArrayList<String> subjects = new ArrayList<>();
	
	public static void main(String[] args) {
	
		subjects.add("English");
		subjects.add("Biology");
		subjects.add("History");
		subjects.add("Geography");
		subjects.add("Mathematics");
		subjects.add("Logic");
		subjects.add("Genetics");
		
		System.out.println("Unsorted List: " + subjects.toString());
		Collections.sort(subjects);
		System.out.println("Sorted List: " + subjects.toString());

	}

}
