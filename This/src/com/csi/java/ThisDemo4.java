package com.csi.java;
class That4{
	//to pass as an argument in method
	void m(That4 tt)
	{
		System.out.println("i am m()");
	}
	void n()
	{
		this.m(this);
		System.out.println("i am n()");
	}
}
public class ThisDemo4 {
public static void main(String[] args) {
	That4 t4=new That4();
	t4.n();
}
}
