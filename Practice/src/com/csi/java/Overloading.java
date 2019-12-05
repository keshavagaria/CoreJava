package com.csi.java;
class A{
	/*void call(int n)
	{
		System.out.println(n);
	}*/
	void call(Integer n)
	{
		System.out.println(n);
	}
	
}
public class Overloading {
public static void main(String[] args) {
	A a=new A();
	a.call(123);
	a.call(65465);
	a.call(6333);
	a.call(420);

}
}
