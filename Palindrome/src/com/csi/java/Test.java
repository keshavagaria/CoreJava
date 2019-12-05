package com.csi.java;

public class Test {
	public static void main(String[] args) {
String s="NITIN";
StringBuilder sb=new StringBuilder(s);
StringBuilder rev=sb.reverse();
String s2=rev.toString();

if(s.equals(s2))
{
	System.out.println("palindrome");
}
else{
	System.out.println("Not a Palindrome");
}
}
}