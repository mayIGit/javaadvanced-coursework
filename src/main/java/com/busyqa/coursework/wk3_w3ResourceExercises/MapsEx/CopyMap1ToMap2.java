//Write a Java program to copy all of the mappings 
//from the specified map to another map.
//putAll()
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CopyMap1ToMap2 {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		Map<Integer,String> map2 = new LinkedHashMap<>();
		
		map1.put(10, "Tens Place");
		map1.put(100, "Hundreds Place");
		map1.put(1000, "Thousands Place");
		
		map2.putAll(map1);
		
		map2.put(1001, "Thousand and 1");
		//printOut(map1);
		printOut(map2);

	}

	private static void printOut(Map<Integer, String> map1) {
	
		System.out.println("The map contains: ");
		
		map1.forEach((k,v)->{
			System.out.println(k + ", " + v);
		});
		
	}

}
