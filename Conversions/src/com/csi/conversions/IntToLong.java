package com.csi.conversions;

public class IntToLong {
public static void main(String[] args) {
	
	//int -> long
	/*int i=100;
	long j=i;
	System.out.println(i);
	System.out.println(j);
	
	Long l=new Long(i);
	System.out.println(l);
	
	Long l2=Long.valueOf(i);
	System.out.println(l2);*/
	
	//long -> int
	long l=55000;
	Long l2=new Long(500);
	int i=(int) l;
	int j=l2.intValue();
			System.out.println(j);
			System.out.println(i);
}
}
