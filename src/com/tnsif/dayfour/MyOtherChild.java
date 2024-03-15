package com.tnsif.dayfour;

import com.tnsif.daythree.MyClass;

public class MyOtherChild extends MyClass{
	public void change()
	{
		//defaultNumber=11;
	    protectedNumber=212;
		//privateNumber=30;
		publicNumber=412;
		
	    display();
	    
	    MyOtherChild childobj = new MyOtherChild();
	    childobj.change();
	}
}
