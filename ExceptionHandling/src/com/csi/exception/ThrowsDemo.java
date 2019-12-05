package com.csi.exception;

import java.io.IOException;

public class ThrowsDemo {
	void m() throws IOException 
	{
		
			throw new IOException("Checked Exception");
		
	}
	void n() throws IOException
	{
		
		m();
		
	
	}
	void p() throws IOException
	{
	
			n();
		
	}

public static void main(String[] args) throws IOException  {
	ThrowsDemo d=new ThrowsDemo();
	
		d.p();

	System.out.println("normal flow");
}
}
