package com.busyqa.coursework.wk3_answer;

import java.util.Scanner;

/*
 * Instructions:
 * 
 * You are given an interface AdvancedArithmetic that contains a method 
 * signature "int divisorSum(int n)". You need to write a class called 
 * Calculator which implements the interface. divisorSum function just takes 
 * an integer as input and return the sum of all its divisors. 
 * For example divisors of 6 are 1, 2, 3 and 6, so divisorSum should return 12. 
 * The value of n will be at most 1000. Read the partially completed code in the 
 * editor and complete it. You just need to write the Calculator class only. 
 * Your class shouldn't be public.
 * 
 */

interface AdvancedArithmetic{
  int divisorSum(int n);
}

/*
 * Write your code here!!!
 */
class Calculator implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			
			if(n%i == 0)
			{
				sum += i;
			}
		}
		return sum;
	}
	
}


class InterfaceImplementation{
    
	public static void main(String []args) throws Exception{
    	
		/*
		 * Uncomment the following chunk of code once the class was created.
		 */
		
        Calculator myCalculator = new Calculator();
        
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n>1000)
		{
        	try {
        	 throw new Exception("The value cannot be over 1000");
        	}
        	finally {
        		sc.close();
        	}
		}
        
        try {
        	System.out.print(myCalculator.divisorSum(n) + "\n");
        	sc.close();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        finally {
        	sc.close();
        }
    }
	
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of 
     *  the interfaces it implemented.
     */
    @SuppressWarnings("rawtypes")
	static void ImplementedInterfaceNames(Object o){
		Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}