package com.csi.java;

class That2{
	void m()
	{
		System.out.println("hi i am m()");
	}
	void n()
	{
		//to refer current class method
		this.m();
		System.out.println("hi i am n");
	}
}
public class ThisDemo2 {
public static void main(String[] args) {
	That2 t2=new That2();
	t2.n();
}
}
