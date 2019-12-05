package com.csi.string;

public class StringTest {
public static void main(String[] args) {
	String s="SachinTendulkar";
	System.out.println(s.length());
	System.out.println(s.substring(6));
	System.out.println(s.subSequence(0, 6));
	//trim->remove white spaces
	String s2="   Sachin    ";
	System.out.println(s2);
	System.out.println(s2.trim());
}
}
