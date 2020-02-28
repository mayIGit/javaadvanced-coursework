//Write a Java program to get a shallow copy of a HashMap instance.
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

//clone() can be only used with HashMap and not Map

import java.util.HashMap;

public class ShallowCopyMap {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		HashMap<Integer,Integer> m1 = new HashMap<>();
		HashMap<Integer,Integer> m2 = new HashMap<>();
		
		m1.put(100, 1000);
		m1.put(200, 2000);
		m1.put(300, 3000);
		m1.put(400, 4000);
		
		m2 = (HashMap<Integer, Integer>)m1.clone();
		
		System.out.println(m2);
		

	}

}
