package com.tnsif.dayfour;

public class StudentDemo {

	public static void main(String[] args) {
		Student studobjone = new Student();
		
		System.out.println("RollNo :"+studobjone.getRollNo());
		System.out.println("Name :"+studobjone.getName());
		System.out.println("Branch :"+studobjone.getBranch());
		
		studobjone.setRollNo(1);
		studobjone.setName("Satish");
		studobjone.setBranch("ENTC");

		System.out.println("-------------------------------");
		System.out.println("RollNo :"+studobjone.getRollNo());
		System.out.println("Name :"+studobjone.getName());
		System.out.println("Branch :"+studobjone.getBranch());
		
		Student studobjtwo=new Student(2,"Mayur","ENTC");
		
		System.out.println("-------------------------------");
		System.out.println("RollNo :"+studobjtwo.getRollNo());
		System.out.println("Name :"+studobjtwo.getName());
		System.out.println("Branch :"+studobjtwo.getBranch());
		
		Student stud;
		stud = studobjone.getStudent();
		
		System.out.println("-------------------------------");
		System.out.println("RollNo :"+stud.getRollNo());
		System.out.println("Name :"+stud.getName());
		System.out.println("Branch :"+stud.getBranch());
	}

}
