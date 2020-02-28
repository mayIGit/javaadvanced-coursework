//Write a Java program to count the number of key-value 
//(size) mappings in a map.
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.HashMap;
import java.util.Map;
public class CountMappings {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1000, "One Thousand");
		map.put(2000, "Two Thousand");
		map.put(3000, "Three Thousand");
		
		System.out.println("Map size: " + map.size());
		
		printOut(map);
	}

	private static void printOut(Map<Integer,String> map) {
		System.out.println("\nThe List");
		map.forEach((k,val)->{
			System.out.println(k + "," + val);
		});
		
		
	}

}
