package com.csi.conversions;

import javax.sound.midi.Synthesizer;

public class Demo3 {
public static void main(String[] args) {
	//String -> Long
	String s="45454444";
	long l1=Long.parseLong(s);
	Long l2=Long.valueOf(s);
	System.out.println(l1);
	System.out.println(l2);
	
	//long -> String
	long l3=6463316463461L;
	String s2=String.valueOf(l3);
	String s3=String.format("%d", l3);
	String s4=Long.toString(l3);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
}
}
