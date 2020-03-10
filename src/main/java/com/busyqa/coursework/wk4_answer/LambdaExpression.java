package com.busyqa.coursework.wk4_answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LambdaExpression {

	
	/*
	 * Copy your solution for Maps Exercise but this time print the elements using a 
	 * lamba expression. (Hint: Use the forEach method of the Map Interface)
	 * 
	 */
	
public Map<Integer,String> readFile() {
		
		Map<Integer,String> map = new HashMap<>();
		
		/*The try-with-resources statement is a try statement that declares one 
		 * or more resources. A resource is an object that must be closed after 
		 * the program is finished with it. The try-with-resources statement 
		 * ensures that each resource is closed at the end of the statement. 
		 * Any object that implements java.lang.AutoCloseable, which includes 
		 * all objects which implement java.io.Closeable, can be used as a resource.*/
		
	    try( BufferedReader br = new BufferedReader(new InputStreamReader(getClass().
        		              getClassLoader().getResourceAsStream("pairs.txt")));){ 
	    	/*Reads the file from the resources folder of the project.*/

	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] pair = line.split(",");
	            if (pair.length==2) {
	               map.put(Integer.valueOf(pair[0]), pair[1]);
	            } else {
	            	throw new Exception("Pair key must contain two elements");
	            }
	        }
	    } catch (Exception e) {
	    	//e.printStackTrace();
	        System.out.println("Error with the file: " + e.getMessage());
	    }

	    return map;
	}	
		
	public static void main(String[] args) {
		

		Map<Integer,String> map = new Maps().readFile();
		
		
		/* Add your solution here. */
		
		//Solution1 - creating a ArrayList from the Hashmap entries
		
		Set<Entry<Integer, String>> entries = map.entrySet();
		
		ArrayList<Entry<Integer,String>> keyList = 
				new ArrayList<Entry<Integer,String>>(entries);
		
		
		System.out.println("List before sorting");
		System.out.printf("Key List: " + keyList);
		
		//lambda expression
		keyList.sort(
				(Map.Entry<Integer,String> k, Map.Entry<Integer,String> v)-> 
				k.getKey().compareTo(v.getKey()));
				
				
		
		System.out.println("*************");
		System.out.println("List after sorting");
		System.out.printf("Key List: " + keyList);
	}

	}


