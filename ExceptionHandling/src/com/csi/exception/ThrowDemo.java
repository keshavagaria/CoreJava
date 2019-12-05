package com.csi.exception;

import java.io.IOException;

public class ThrowDemo {
public static void main(String[] args)  
{
	int i=50;
	
	if(i>25)
	{
		try{
		throw new ArithmeticException("Arithmetic Execption occured");          //Unchecked Exception
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
	else{
		System.out.println("this is else part");
	}

	System.out.println("rest of the code");
	
	

}
}
