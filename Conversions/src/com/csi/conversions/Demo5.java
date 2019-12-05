package com.csi.conversions;

public class Demo5 {
public static void main(String[] args) { 
        //String -> Double
	String s="6465654.789";
	double d=Double.parseDouble(s);
	System.out.println(d);
	Double dd=Double.valueOf(s);
	System.out.println(dd);
	
	//Double -> String
	double d2=999999.9999;
String s2=	String.valueOf(d2);
	System.out.println(s2);
	String s3=Double.toString(d2);
	System.out.println(s3);
	String s4=String.format("%f", d2);
	System.out.println(s4);
}
}
