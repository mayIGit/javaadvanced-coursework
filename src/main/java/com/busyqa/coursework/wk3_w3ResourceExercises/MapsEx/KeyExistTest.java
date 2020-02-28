//Write a Java program to test if a map contains a 
//mapping for the specified key or specified value.

package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.HashMap;

public class KeyExistTest {
	static Map<Integer,Integer> m1 = new HashMap<>();
	
	public static void main(String[] args) {
		
		m1.put(1,2);
		m1.put(2,3);
		m1.put(3,4);
		m1.put(4,5);
		
		Integer testKey = 3;
		System.out.println("TestKey: " + testKey +"to be found in either key or value");
		
		m1.forEach((k,v)->{
			if(k == testKey || v == testKey) {
				
				System.out.println("Key:" + k +", Value:"+ v + " We found a match!" );
				
			}
			else
			{
				System.out.println("Key:" + k +", Value:"+ v + " Negative, no match!");
			}
		});
		
		

	}

}
