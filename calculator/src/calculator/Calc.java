package calculator;

import java.util.Scanner;

public class Calc 
{

	public static void main(String[] args) 
	{
		int operator;
		double num1, num2, result;
	   
		Scanner input = new Scanner(System.in);
	    System.out.println("enter your choice: 1,2,3, or 4");
	    operator =input.nextInt();
	    
	    System.out.println("Enter first number");
	    num1=input.nextDouble();
	    
	    System.out.println("Enter second number");
	    num2=input.nextDouble();
	    
	    switch(operator)
	    {
	    case 1:
	    	result=num1+num2;
	    	System.out.println("sum of numbers ::" + result);
	    	break;
	    
	    case 2:
	    	result=num1-num2;
	    	System.out.println("diff of numbers ::" + result);
	    	break;
	    
	    case 3:
	    	result=num1*num2;
	    	System.out.println("mul of numbers ::" + result);
	    	break;
	    
	    case 4:
	    	result=num1/num2;
	    	System.out.println("div of numbers ::" + result);
	    	break;
	    
	    }
	     input.close();
	    
	    
	}
}
