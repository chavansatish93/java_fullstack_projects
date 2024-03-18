package com.tnsif.dayfive;

public class AssignEmp {
	
	static String company;
	int emp_id;
	String emp_name;
	String emp_dept;
	double salary;
	String city;
	
	static
	   {
		   company="TCS";
	   }
	   
	    public AssignEmp()
	   {
		   company="WIPRO";
		   emp_id=101;
	       emp_name="SATISH";
		   emp_dept="IT";
		   salary=45890.89;
		   city="Banglore";

	   }
	   
	   public void change()
	   {
		   emp_id++;
		   salary++;
		   
	   }
	   
	
	
	
	 public static void display()
	   {
		  System.out.println("Static company = "+company);
		//  System.out.println("Non static number = "+number);
	   }
	   void show()
	   {
		   System.out.println("------------------------");
		   System.out.println("Static company = "+company);
		   System.out.println("Non static Emp_ID = "+emp_id);
		   System.out.println("Non static Name = "+emp_name);
		   System.out.println("Non static Dept = "+emp_dept);
		   System.out.println("Non static Salary = "+salary);
		   System.out.println("Non static City = "+city);
	   }
	
	

}
