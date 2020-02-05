package com.mobile.static_nested;


class Outer3{
	static private int data=500;
	//private int x=100;
	static class Inner3{
		//By default static
		void display()
		{
			System.out.println("Hello "+data);
			//System.out.println("Hello "+x);
		}
	}
}
public class StaticNestedClass {
public static void main(String[] args) {
	Outer3.Inner3 nested=new Outer3.Inner3();
	nested.display();
}
}
