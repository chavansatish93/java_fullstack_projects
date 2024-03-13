//porgram to create objects
package com.tnsif.daythree;

public class Demo {

	public static void main(String[] args) {
		Person obj = new Person();
		
		obj.name="Satish";
		obj.age=24;
		obj.gender="Male";
		obj.display();
		
		Person objone = new Person();
		objone.accept();
		objone.display();
		

	}

}
