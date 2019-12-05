package com.csi.exception;
//finally
public class ExceptionDemo3 {
	public static void main(String[] args) {
try{
	int i=500/0;
}catch(NullPointerException e)
{
	e.printStackTrace();
}finally{
	System.out.println("finally will always execute");	
}
System.out.println("normal code");
}
}
