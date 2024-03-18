package com.tnsif.daythree;

//import com.tnsif.dayfour.MyClass;

public class MyClassDemo {

	public static void main(String[] args) {
		
        MyClass obj=new MyClass();
		
		obj.defaultNumber=10;
		obj.protectedNumber=20;
		//obj.privateNumber=30;
		obj.publicNumber=40;
		
		obj.display();
		
		System.out.println("-------------");
		
		MyChild childobj=new MyChild();
		childobj.change();
	}

}
