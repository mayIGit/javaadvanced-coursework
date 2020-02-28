//Write a Java program to insert an element into the array list at the first position.

package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;
public class InsertElementInArrayList {

	static ArrayList<Character> charArr = new ArrayList<>();
	
	public static void main(String[] args) {
	
		//populate arrayList charArr
		charArr.add('A');
		charArr.add('a');
		charArr.add('E');
		charArr.add('e');
		charArr.add('I');
		charArr.add('i');
		charArr.add('O');
		charArr.add('o');
		charArr.add('U');
		charArr.add('u');
		
		//check to see if array is populated
		System.out.println(charArr.toString());
		
		//Adding an element at 0 position
		//note: add - adds an element, set - replaces it
		charArr.add(0,'x');
		charArr.add(0,'X');
		//charArr.set(0, 'x');
		
		//check to see if array is populated
		System.out.println(charArr.toString());
	}

}
