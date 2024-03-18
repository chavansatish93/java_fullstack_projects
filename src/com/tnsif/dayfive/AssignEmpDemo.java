package com.tnsif.dayfive;

public class AssignEmpDemo {

	public static void main(String[] args) {
       System.out.println(AssignEmp.company);
		
		AssignEmp obj=new AssignEmp();
		obj.show();
		AssignEmp.display();
		
		System.out.println("---------------");
		
		AssignEmp objone=new AssignEmp();
		objone.show();
		AssignEmp.display();
		System.out.println("---------------");
		
		AssignEmp objtwo=new AssignEmp();
        objtwo.show();
        AssignEmp.display();

	}

}
