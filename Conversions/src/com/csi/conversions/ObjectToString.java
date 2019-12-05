package com.csi.conversions;

public class ObjectToString {
public static void main(String[] args) {
	
	//Immutaable -> Mutable
	String s="Hello";
	StringBuilder sb=new StringBuilder(s);
	sb.reverse();
	System.out.println(s);
	System.out.println(sb);
	
	//Mutable -> immutable
	String immutable=sb.toString();
	System.out.println(immutable);
}
}
