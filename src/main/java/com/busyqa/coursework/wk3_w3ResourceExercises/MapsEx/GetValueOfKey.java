//Write a Java program to get the value of a specified key in a map.
package com.busyqa.coursework.wk3_w3ResourceExercises.MapsEx;

import java.util.Map;
import java.util.HashMap;

public class GetValueOfKey {

	public static void main(String[] args) {
		Map<Integer,String> fruits = new HashMap<Integer, String>();
		
		fruits.put(100, "Grapes");
		fruits.put(102, "Orange");
		fruits.put(104,	"Kiwi");
		
		int keyCode = 102;
		
		System.out.println(fruits.get(keyCode));
		System.out.println(fruits.hashCode());
		System.out.println(fruits.values());
		System.out.println(fruits.keySet());
		System.out.println(fruits.entrySet());
		
		
//		fruits.forEach((key,value)->{
//			if(key==keyCode) {
//				System.out.println(key + ":" + value);
//			}
//			else {
//				System.out.println("Not Found!");
//			}
//		});
	}

}
