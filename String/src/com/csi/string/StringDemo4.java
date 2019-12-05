package com.csi.string;

public class StringDemo4 {
public static void main(String[] args) {
	String s1=new String("abc");
	String s2="abc";
	String s3="abc";
	
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	
	s1=s1.intern();
	System.out.println(s1==s2);
}
}
