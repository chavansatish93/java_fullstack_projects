package com.tnsif.daytwo;

public class DecisionMakingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;

		if (number >= 10) {
			System.out.println("---------");

		}
		
		number = -4;
		
		if(number>=0)
		{
			System.out.println(number +" is positive");
		}
		
		else
			System.out.println(number+" is negative");
		
		int a=5, b=25;
		
		
		if(a>b)
			System.out.println(a+" a is largest");
		else if(b>a)
			System.out.println(b+" b is largest");
		else
			System.out.println("Both are same");
			
		int c=22;
		
		System.out.println("------------------");
		
		System.out.println("a = "+a+" b = "+b+" c= "+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is largest");
			}
			else
				System.out.println(c+" is largest");
		}
		else
		{
			System.out.println(b+" is largest");
		}
		
		System.out.println("----------------");
		
		switch(a)
		{
		case 5:
			System.out.println("five");
			break;
		case 10:
			System.out.println("ten");
			break;
		default:
			System.out.println("invalid");
			break;
		
		}

	}

}
