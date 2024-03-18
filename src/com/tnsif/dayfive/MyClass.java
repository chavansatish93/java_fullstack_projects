package com.tnsif.dayfive;

public class MyClass {
   static int no;//its in italic
   int number;
   
   static
   {
	   no=100;
   }
   
    public MyClass()
   {
	   no=10;
	   number=5000;
   }
   
   public void change()
   {
	   no++;
	   number++;
   }
   
  public static void display()
   {
	  System.out.println("Static no = "+no);
	//  System.out.println("Non static number = "+number);
   }
   void show()
   {
	   System.out.println("Static no = "+no);
	   System.out.println("Non static number = "+number);
   }
}
