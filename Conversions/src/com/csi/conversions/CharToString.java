package com.csi.conversions;

public class CharToString {
public static void main(String[] args) {
	
	//char -> String
	char[] ch={'H','E','L','L','O'};
	String s=new String(ch);
	System.out.println(s);
	
	char ch2='C';
	String s2=String.valueOf(ch2);
	System.out.println(s2);
	
	
	char ch3='G';
	String s3=Character.toString(ch3);
	System.out.println(s3);
	
	//String -> char
	/*String s="Hello";
	char c=s.charAt(0);
	System.out.println(c);
	
	for(int i=0;i<s.length();i++)
	{
			char ch=s.charAt(i);
			System.out.println(ch);
	}
	
	char[] cc=s.toCharArray();
	for(int j=0;j<cc.length;j++)
	{
		System.out.println(cc[j]);
	}
*/
}
}
