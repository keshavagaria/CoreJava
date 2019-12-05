package com.csi.string;

public class StringDemo2 {
public static void main(String[] args) {
	String s="Sachin";
	String s2="Sachin";
	String s3=new String("Sachin");
	String s4="SACHIN";
	System.out.println(s.equals(s2));
	System.out.println(s==s2);
	System.out.println(s.equals(s3));
	System.out.println(s==s3);
	System.out.println(s.equals(s4));
	System.out.println(s==s4);
	System.out.println(s.equalsIgnoreCase(s4));
}
}
