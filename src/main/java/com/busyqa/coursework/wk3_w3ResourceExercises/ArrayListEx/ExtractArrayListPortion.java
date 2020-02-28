
//Write a Java program to extract a portion of a array list.
//We use the subList method to do this
//Since subList returns a list we will need to store it into a List datatype
//variable or else type cast it again while receiving
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
import java.util.List;


public class ExtractArrayListPortion {

	static ArrayList<Character> cList = new ArrayList<>();
	static List<Character> eList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		cList.add('B');
		cList.add('E');
		cList.add('A');
		cList.add('R');
		cList.add('S');
		
		System.out.println("Original List: " + cList.toString());
		
		
		eList = cList.subList(1, 4);
		
		System.out.println("Extracted List: " + eList.toString());
	}

	@Override
	public String toString() {
		return "ExtractArrayListPortion []";
	}

}
