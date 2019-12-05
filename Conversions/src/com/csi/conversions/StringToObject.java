package com.csi.conversions;
class Employee{
	int i;
	void display()
	{
		i=500;
		System.out.println("i am "+i);
	}
}
public class StringToObject {
public static void main(String[] args) throws ClassNotFoundException {
	//String -> Object
/*	String s="Hello";
	Object o=s;
	System.out.println(o);
	
Class c=	Class.forName("com.csi.conversions.StringToObject");
System.out.println(c.getName());
System.out.println(c.getSuperclass().getName());*/

//Object -> String
Employee e=new Employee();
e.display();
String s=e.toString();
System.out.println(s);
System.out.println(String.valueOf(e));

}
}
