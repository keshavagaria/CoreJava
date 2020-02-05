package com.mobile.non_static_nested;


class Outer2{
	private String name="Keshav";
	void display()
	{
		class Inner2{
			void show()
			{
				System.out.println("Hello "+name);
			}
		}
	Inner2 inner=new  Inner2();
	inner.show();
	}
}
public class LocalInnerClass {
		public static void main(String[] args) {
			Outer2 outer=new Outer2();
			outer.display();
		}
}
