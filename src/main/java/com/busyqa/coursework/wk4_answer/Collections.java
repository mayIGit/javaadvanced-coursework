package com.busyqa.coursework.wk4_answer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
import java.util.*;

public class Collections {

	/*
	 * This program reads the file named "colors.txt" The file resides in the 
	 * "src/main/resources" folder of this project. The file contains color names
	 * that are populated into an ArrayList of Strings. (Already coded)
	 * 
	 * Once the ArrayList is populated, remove all the elements that are 
	 * repeated(Hint: Use a Set)
	 * 
	 * Sort the Arraylist (prefer an algorithm with low Time and Space Complexity).
	 * Find using binarySearch and Print on the console the position for the element 
	 * "Blue" in the ArrayList.
	 */
	
	public List<String> readFile() {
		
		List<String> list = new ArrayList<>();
		
		/*The try-with-resources statement is a try statement that declares one 
		 * or more resources. A resource is an object that must be closed after 
		 * the program is finished with it. The try-with-resources statement 
		 * ensures that each resource is closed at the end of the statement. 
		 * Any object that implements java.lang.AutoCloseable, which includes 
		 * all objects which implement java.io.Closeable, can be used as a resource.*/
		
	    try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
        		              getClassLoader().getResourceAsStream("colors.txt")));){ 
	    	/*Reads the file from the resources folder of the project.*/

	        String line;
	        while ((line = br.readLine()) != null) {
	            list.addAll(Arrays.asList(line.split(",")));
	        }
	    } catch (IOException e) {
	    	//e.printStackTrace();
	        System.out.println("Error with the file: " + e.getMessage());
	    }

	    return list;
	}	

    
	public static void main(String[] args) {
		
		List<String> list = new Collections().readFile();
		/* Add your solution here. */
		System.out.println("Original: " + list);
		
		Set<String> setList = new LinkedHashSet<String>(list); //keeps the order and removes repeated elements
		System.out.println("Removed repeated: " + setList);
		
		list.clear();
		for(String s: setList)
		{
			list.add(s);
		}
		//sort list
		//Collections.sort - cannot be used because this class is called Collections unless you use the full name
		//so, first converting to an array, sorting the array and then changing it back to List
		//The aim is to use the best time complexity; arrays.sort uses quick sort algorithm and so it works best
		
//					String[] myArr = new String[setList.size()]; 
//					setList.toArray(myArr);
//					Arrays.sort(myArr);
//					list.clear();
//					list = Arrays.asList(myArr);
		
		
		
		java.util.Collections.sort(list);
		System.out.println("Sorted: " + list);
		
		//Binary search for 'Blue'
		int res = java.util.Collections.binarySearch(list,"Blue");
		
		if(res >= 0) {
			System.out.println("Blue found at index: " + res);
		}
		else
		{
			System.out.println("Blue Not found!");
		}
		
		
	}


	

}
