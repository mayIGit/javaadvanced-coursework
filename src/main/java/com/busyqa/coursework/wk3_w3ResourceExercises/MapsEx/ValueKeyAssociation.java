//Write a Java program to associate the specified value with the 
//specified key in a HashMap.

package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.HashMap;
import java.util.Map;

public class ValueKeyAssociation {

	public static void main(String[] args) {
		Map<Integer,String> map1 = new HashMap<>();
		
		map1.put(1,"Google");
		map1.put(2,"Yahoo");
		map1.put(3,"Duck Duck");
		
		System.out.println(map1.size());
		
		map1.forEach((k,v)->{
			System.out.println(k + " " + v);
		});

	}

}
