//Write a Java program to create a set view of the 
//mappings contained in a map - entry_set()
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;
public class CreateSetView {

	static Map<String,String> couples = new HashMap<>();
	public static void main(String[] args) {
		
		couples.put("Prashant","Meghana");
		couples.put("James","Lizbeth");
		couples.put("Andrew","Jennifer");
		couples.put("Bernard","Venessa");
		couples.put("Richard","Ruth");
		couples.put("Sumit","Mumia");
		couples.put("Shaibal","Jui");
		couples.put("Ajay","Radhika");
		couples.put("Sowmya","Bidisha");
		couples.put("Raman","Shaalu");
		couples.put("Vishal","Hema");
		
		//Creating a Set View for a map
		
		Set<Entry<String,String>> setView = couples.entrySet();
		Set<String> keySet = couples.keySet();
		
		
		System.out.println("Set values of Map couples" + setView);
		System.out.println("Key Set View of Map couples" + keySet);
	}
	
	
}
