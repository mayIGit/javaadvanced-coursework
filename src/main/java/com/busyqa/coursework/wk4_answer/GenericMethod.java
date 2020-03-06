package com.busyqa.coursework.wk4_answer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenericMethod {

	/*
	 * Code a static Generic method that prints on console all the elements of a 
	 * Collection of any type.
	 * Then use the method to print the elements of a HashSet and an ArrayList.
	 */
	public static <E> void print(Collection<E> collection) {
	
		/* Add your solution here. */
		for(E x : collection) {
			//System.out.println(x);
			System.out.printf("[ %s ]", x);
		}
	}
	
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Purple");
		list.add("Brown");

		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(2);
		set.add(8);
		set.add(7);
		set.add(9);
		
		GenericMethod.print(list);
		GenericMethod.print(set);
		
	}

}
