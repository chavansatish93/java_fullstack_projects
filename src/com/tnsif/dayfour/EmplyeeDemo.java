package com.tnsif.dayfour;

public class EmplyeeDemo {

	public static void main(String[] args) {
		 
		Employee empobjone=new Employee();
		
		System.out.println("Employee ID :"+empobjone.getEmp_id());
		System.out.println("Employee Name :"+empobjone.getEmp_name());
		System.out.println("Department :"+empobjone.getDept());
		System.out.println("Salary :"+empobjone.getSalary());
		
		empobjone.setEmp_id(101);
		empobjone.setEmp_name("Satish");
		empobjone.setDept("IT");
		empobjone.setSalary(65000);
		
		System.out.println("***************************************");
		
		System.out.println("Employee ID :"+empobjone.getEmp_id());
		System.out.println("Employee Name :"+empobjone.getEmp_name());
		System.out.println("Department :"+empobjone.getDept());
		System.out.println("Salary :"+empobjone.getSalary());
		
		Employee empobjtwo=new Employee(102,"Mayur","QA",65000);
		
        System.out.println("***************************************");
		
		System.out.println("Employee ID :"+empobjtwo.getEmp_id());
		System.out.println("Employee Name :"+empobjtwo.getEmp_name());
		System.out.println("Department :"+empobjtwo.getDept());
		System.out.println("Salary :"+empobjtwo.getSalary());
		
		
	}

}
