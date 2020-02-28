//Write a Java program to update specific array element by given element.
package com.busyqa.coursework.wk3_w3ResourceExercises.ArrayListEx;

import java.util.ArrayList;

public class ReplaceElementArrayList {

	static ArrayList<String> things = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		
		things.add("books");
		things.add("cassettes");
		things.add("videos");
		things.add("CDs");
		things.add("mugs");
		things.add("keys");
		
		System.out.println(things.toString());
		replaceElement(things,"pens",3);
		System.out.println(things.toString());
		
		
	}
	
	//replace element method
	
	static void replaceElement(ArrayList<String> arr, String searchElement, int indx) {
		arr.set(indx,searchElement);
	}

}
