package com.csi.exception;

import java.io.IOException;

class Parent{
	void display() throws IOException
	{
		System.out.println("i am parent");
	}
}
class Child extends Parent{
	void display() throws ArithmeticException
	{
		System.out.println("i am child");
	}
}
public class InheritenceHandling {
public static void main(String[] args) throws Exception {
	Child c=new Child();
	c.display();
	System.out.println("source code");
}
}
