//Write a Java program to check whether a map 
//contains key-value mappings (empty) or not.

package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.HashMap;

public class ContainsMappings {

	static boolean check = false;
	public static void main(String[] args) {
		
		Map<String,String> m = new HashMap<>();
		
		m.put("a" ,"Apple");
		m.put("b", "Ball");
		m.put("c","Cat");
		
		
		//check if empty
		System.out.println("Is Empty?:" + m.isEmpty());
		System.out.println("The map: " + m);
		System.out.println("Contains Apple:" + m.containsValue("Apple"));
		

	}

	

}
