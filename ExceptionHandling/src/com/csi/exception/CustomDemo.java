package com.csi.exception;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
}
public class CustomDemo {
         static void validate(int i) throws MyException{
		if(i<18)
		{
			throw new MyException("not eligble");
		}
		else{
			System.out.println("eligible");
		}
		System.out.println("rest of code");
	}
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	try {
		validate(i);
	} catch (MyException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	System.out.println("rest code");
}
}
