package com.csi.lambda;
//functional interface
interface Lambda{
	
	String hello(int i);
}
public class Demo {
public static void main(String[] args) {
/*Lambda l=new Lambda()
{
	public String hello(int i)
	{
		System.out.println(i+100);
		return "Hello Universe";
	}
};*/
	
Lambda l=(i)->{System.out.println(i+100);return "Hello World";};
	
System.out.println(l.hello(900));
}
}