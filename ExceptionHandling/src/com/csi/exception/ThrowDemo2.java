package com.csi.exception;

import java.io.IOException;
import java.util.Scanner;

public class ThrowDemo2 {
	public static void validate(int i)  
	{
		if(i<18)
		{
			try{
				throw new ArithmeticException("not eligible to vote");
			}
			
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			finally{
				System.out.println("i will always execute");
			}
			}
		/*if(i<18)
		{
			throw new ArithmeticException("not eligible to vote");
		}*/
		
	/*	if(i<18)
		{
			throw new IOException("not eligible to vote");
			
		}*/
		
		/*if(i<18)
		{
			try {
				throw new IOException("not eligible to vote");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}*/
	else{
		System.out.println("eligible to vote");
	}
		System.out.println("normal flow");
	}
public static void main(String[] args)  {
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();

		
				validate(i);
			
	
System.out.println("normal code");

}
}
