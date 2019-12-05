package com.csi.java;
class That6
{
	//this can be used to return current class instance
	That6 display()
	{
		System.out.println("i am display");
		return this;
	}
}
public class ThisDemo6 {
public static void main(String[] args) {
	That6 t6=new That6();
	t6.display();
}
}
