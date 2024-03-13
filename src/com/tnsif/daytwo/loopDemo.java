package com.tnsif.daytwo;

public class loopDemo {

	public static void main(String[] args) {
	
		int i;
		for(i=0;i<=10;i++);//if we put ';'=i+1=10+1=11 here its treat as null loop
		{
			System.out.println("Hello "+i);//loop will execute 11 times
		}
		
	System.out.println("--------------------");	
	
		for(int j=0;j<=10;j++)
		{
			System.out.println("Hello "+j);
		}
		
		System.out.println("--------------------");	
		
		/* for(int j=10;j>=i;j--)
		{
			System.out.println("Hi "+j--);
		}
		*/
		
		//System.out.println("--------------------");	
		int j=100;
		
		while(j<=100)
		{
			System.out.println(j+" Times this will execute");
			j++;
		}
		
		System.out.println("--------------------");
		do
		{
			System.out.println("----- "+j);
			j--;
		} while(j>=i);
		
		System.out.println("--------------------");	
		
		for(j=1;j<=10;j++)
		{
			if(j==5)
				//break;
				continue;
			System.out.println("j= "+j);
		}


	}

}
