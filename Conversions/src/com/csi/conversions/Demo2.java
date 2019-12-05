package com.csi.conversions;

public class Demo2 {
public static void main(String[] args) {
	//int -> String
	int i=1000;
String s=String.valueOf(i);
String s2=Integer.toString(i);
String s3=String.format("%d", i);
System.out.println(s);
System.out.println(s2);
System.out.println(s3);
}
}
