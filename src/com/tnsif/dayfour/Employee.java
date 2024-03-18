package com.tnsif.dayfour;

public class Employee {
	
	private int Emp_id;
	private String Emp_name;
	private String Dept;
	private float Salary;
	
	
	public Employee()
	{
		System.out.println("default constructor");
	}

	
	//parameterized constructor
	
	public Employee(int Emp_id,String Emp_name,String Dept,float Salary)
	{
		this.Emp_id=Emp_id;
		this.Emp_name=Emp_name;
		this.Dept=Dept;
		this.Salary=Salary;
	}
	
	//getter and setters

	public int getEmp_id() {
		return Emp_id;
	}


	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}


	public String getEmp_name() {
		return Emp_name;
	}


	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}


	public String getDept() {
		return Dept;
	}


	public void setDept(String Dept) {
		this.Dept = Dept;
	}


	public float getSalary() {
		return Salary;
	}


	public void setSalary(float Salary) {
		this.Salary = Salary;
	}

}
