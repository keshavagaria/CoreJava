package com.csi.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
public static void main(String[] args) {
	StringTokenizer st=new StringTokenizer("My Name Is Khan");
	System.out.println(st.countTokens());
	while(st.hasMoreTokens())
	{
		System.out.println(st.nextToken());
	}
}
}
