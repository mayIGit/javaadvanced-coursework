//Write a Java program to remove all of the mappings from a map.
//clear()
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.HashMap;

public class RemoveMappings {

	public static void main(String[] args) {
	
		Map<Integer,Integer> intMap = new HashMap<>();
		
		intMap.put(1, 5000);
		intMap.put(2, 8000);
		intMap.put(3, 10000);
		intMap.put(4, 15000);
		
		System.out.println("Original Map : " + intMap);
		
		intMap.clear();
		
		System.out.println("Cleared Map : " + intMap);
		

	}

}
