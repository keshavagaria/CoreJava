package com.csi.conversions;

public class IntToDouble {
public static void main(String[] args) {
	//int -> double
	/*int i=500;
	double d=i;
	System.out.println(d);
	Double d2=new Double(i);
	System.out.println(d2);
	
   Double d3=Double.valueOf(i);
   System.out.println(d3);*/

	//double -> int
	double d=56555.32;
	int i=(int)d;
	Double dd=new Double(420.420);
	int j=dd.intValue();
	System.out.println(i);
	System.out.println(j);
}
}
