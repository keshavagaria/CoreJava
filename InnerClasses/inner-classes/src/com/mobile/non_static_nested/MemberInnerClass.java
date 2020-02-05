package com.mobile.non_static_nested;

class Outer{
	private String name="Vishu";
	class Inner{
	void display()
	{
		System.out.println("hello "+name);
	}
}
}
public class MemberInnerClass {
public static void main(String[] args) {
	Outer outer=new Outer();
	Outer.Inner inner=outer.new Inner();
	inner.display();
}
}