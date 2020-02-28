//Write a Java program to iterate through all elements in a linked list. 

package com.busyqa.coursework.wk3_w3ResourceExercises.LinkedListsEx;

import java.util.LinkedList;
public class IterateThroughElementsOfLL {

	static LinkedList<Integer> dayNums = new LinkedList<>();
	static LinkedList<String> dayStr = new LinkedList<>();
	
	public static void main(String[] args) {
		
		dayNums.add(1);
		dayNums.add(2);
		dayNums.add(3);
		dayNums.add(4);
		dayNums.add(5);
		dayNums.add(6);
		dayNums.add(7);
		
		dayStr.add("Sunday");
		dayStr.add("Monday");
		dayStr.add("Tuesday");
		dayStr.add("Wednesday");
		dayStr.add("Thursday");
		dayStr.add("Friday");
		dayStr.add("Saturday");
		
		//Iterate through list1
		//display that linked list.
		
		for(int x : dayNums) {
			
			switch(x)
			{
			case 1 : findDay(x,dayStr);break;
			case 2 : findDay(x,dayStr);break;
			case 3 : findDay(x,dayStr);break;
			case 4 : findDay(x,dayStr);break;
			case 5 : findDay(x,dayStr);break;
			case 6 : findDay(x,dayStr);break;
			case 7 : findDay(x,dayStr);break;
			}
		}
		

	}
	
	//findDay method
	static void findDay(int x, LinkedList<String> list)
	{
		
		for(String s : list) {
			if(list.indexOf(s)== x-1)
			{
				System.out.println("Day " + x + " of the week is " + s);
			}
		}
	}

}
