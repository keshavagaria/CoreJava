package com.csi.exception;
//nested try
public class ExceptionDemo2 {
public static void main(String[] args) {
	try{
		
		
		try{
			System.out.println("going to divide");
			int i=15/0;
		}catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception occurs");
		}
		
		
		try{
			System.out.println("array program");
			int a[]=new int[5];
			a[6]=100;
			System.out.println(a[6]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array exception");
		}
		
		try{
			String s="abc";
			System.out.println("String program");
			int k=Integer.parseInt(s);
			System.out.println(k);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("number format exception");
		}
	}catch( Exception e)
	{
		System.out.println("exceptions occured");
	}
	System.out.println("normal flow");
}
}
