package com.csi.covariant;
class A{
	A get()
	{
		System.out.println("I am A");
		return this;
	}
}
class B extends A{
	B get()
	{
		System.out.println("i am b and covariant done");
		return this;
	}
}
public class Demo {
public static void main(String[] args) {
	B b=new B();
	b.get();
}
}
