package com.csi.exception;

public class ThrowDemo3 {
	void m()
	{
		
		int i=50/0;
	
	}
	void n()
	{
		m();
	}
	void p()
	{
		try{
          n();
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
public static void main(String[] args) {
	ThrowDemo3 d3=new ThrowDemo3();
	d3.p();
System.out.println("normal flow");
}
}
