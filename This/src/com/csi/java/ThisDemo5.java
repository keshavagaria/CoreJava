package com.csi.java;
class A{
B obj;
A(B obj)
{
	this.obj=obj;
	System.out.println("i am A");
}
	
}
class B{
	B()
	{
	A a=new A(this);
	}
}
public class ThisDemo5 {
public static void main(String[] args) {
	B b=new B();
}
}
