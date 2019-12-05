package com.csi.conversions;

public class Demo4 {
public static void main(String[] args) {
	//String -> Float
	String s1="64465.45";
	float f1=Float.parseFloat(s1);
	Float f2=Float.valueOf(s1);
	System.out.println(f1);
	System.out.println(f2);
	
	//Float -> String
	float f=4654.23f;
	String s2=String.valueOf(f);
	System.out.println(s2);
    String s3=	Float.toString(f);
    System.out.println(s3);
    String s4=String.format("%f",f);
    System.out.println(s4);
}
}
