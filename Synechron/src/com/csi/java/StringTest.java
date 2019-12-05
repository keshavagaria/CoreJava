package com.csi.java;

public class StringTest {
public static void main(String[] args) {
	char ch[]={'G','C','A','T'};
	String s1=new String(ch);
	StringBuilder sb=new StringBuilder(s1);
	sb.reverse();
	String s2=sb.toString();
	char ch2[]=s2.toCharArray();
	String s4=null;
	for(int i=0;i<ch2.length;i++)
	{
		if(ch2[i]=='A')
			ch2[i]='T';
		
		else if(ch2[i]=='T')
			ch2[i]='A';
		
		else if(ch2[i]=='G')
			ch2[i]='C';
		
		else
			ch2[i]='G';
	System.out.print(ch2[i]);
		 //s4=new String(ch2);
		
		
	}
	
	//System.out.println(s4);
}
}
