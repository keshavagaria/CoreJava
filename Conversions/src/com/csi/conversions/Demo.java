package com.csi.conversions;

public class Demo {
public static void main(String[] args) {
	String s="100";
	//String ->int
	int i=Integer.parseInt(s);
	System.out.println(i);
	//String->Integer
	Integer j=Integer.valueOf(s);
	System.out.println(j);
}
}
