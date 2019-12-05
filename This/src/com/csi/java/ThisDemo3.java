package com.csi.java;
class That3{
	public That3()
	{
		//to refer current class constructor

		this(1,1);
		System.out.println("i am default");
	}
	public That3(int i,int k)
	{
		//to refer current class constructor
		//this();
		System.out.println("i am parameterized "+i+" "+k);
	}
}
public class ThisDemo3 {
public static void main(String[] args) {
	That3 t3=new That3();
	
}
}
