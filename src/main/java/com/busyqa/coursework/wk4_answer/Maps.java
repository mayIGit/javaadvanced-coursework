package com.busyqa.coursework.wk4_answer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	
	/*
	 * This program reads the file named "pairs.txt" The file resides in the 
	 * "src/main/resources" folder of this project. The file contains pairs of values
	 * id(Integer) and name(String) that are populated into an HashMap. (Already coded)
	 * 
	 * Inside the text file there pair values id and name. One pair of values per line.
	 * Once the HashMap is populated.
	 * Print on console the all elements of HashMap sorted by the key. 
	 * Hint: This can be acchived by moving the entries of the HashMap to an ArrayList. 
	 *       Then sort the Arraylist by the key.
     *       The other way which is more efficient is to use a TreeMap (it's like a map 
     *       but sorted by the keys) instead of a HashMap.(Treemaps were not covered 
     *       in class so it may require to do a small research)   
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
		
		//way to sort ArrayList of type <Entry<>>
		keyList.sort(Comparator.comparing(Entry::getKey));
		
		System.out.printf("Key List: " + keyList);
	}
}
