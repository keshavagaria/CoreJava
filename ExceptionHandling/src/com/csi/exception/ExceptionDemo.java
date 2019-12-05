package com.csi.exception;

public class ExceptionDemo {
public static void main(String[] args) {
	int i=0;
	try{
	i=50/0;
	}catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
	finally {
		System.out.println("finally will always work");
	}
	System.out.println("rest of the code");
	System.out.println(i);

}
}
