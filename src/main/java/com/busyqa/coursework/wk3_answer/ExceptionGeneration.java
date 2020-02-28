package com.busyqa.coursework.wk3_answer;
import java.util.Scanner;

/*
 *  Instructions:
 *  
 *  You are required to compute the power of a number by implementing a calculator.         
 *  Create a class MyCalculator that consists of a single method long power(int, int).     
 *  This method takes two integers, n and p, as parameters and finds the value of n 
 *  to the power of p.                                                                                   
 *  If either n or p is negative, then the method must throw an exception which says        
 *  "n or p should not be negative". Also, if both n and p are zero, then the method        
 *  must throw an exception which says "n and p should not be zero".                        
 *                                                                                          
 *  For example, -4 and -5 would result in java.lang.Exception: n or p should not be        
 *  negative.                                                                               
 *                                                                                          
 *  Complete the function power in class MyCalculator and return the appropriate result     
 *  after the power operation or an appropriate exception as detailed above.
 *  
 */              

/*  
 * In a Java file is possible to have many classes but only one can be public. 
 * The name of the java file will the same as the public class.
 */

class MyCalculator { 
    /*
     * Create the method long power(int, int) here.
     */
	
	public long power(int x, int y) {
		
		return (long) Math.pow(x, y);
	}

	/*
	 * Hint:
	 * 
	 * It's possible to create an Exception with the following code:
	 *     throw new Exception("here goes your customized message");
	 */
}

public class ExceptionGeneration {
	
    public static final MyCalculator myCalculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    @SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
    	System.out.println("Enter two numbers");
        while (in .hasNextInt()) {
        	
            int n = in .nextInt();
            int p = in .nextInt();
            
            if(n < 0 || p < 0)
    		{
    			throw new Exception("The values cannot be negative");
    		}
            else
            {
            
            try {
            	System.out.println(p + " " + p);
            	/* Uncomment this once you have create created the method.*/
                System.out.println(myCalculator.power(n, p));
                
            } catch (Exception e) {
                System.out.println(e);
            }
            }
        }
    }
}