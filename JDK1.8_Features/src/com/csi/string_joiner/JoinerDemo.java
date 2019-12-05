package com.csi.string_joiner;

import java.util.StringJoiner;

public class JoinerDemo {
public static void main(String[] args) {
	StringJoiner sj=new StringJoiner("|");
	sj.add("TCS");
	sj.add("Accenture");
	sj.add("Infosys");
	sj.add("CAPGEMINI");
	sj.add("WIPRO");
	System.out.println(sj);
	
System.out.println(sj.length());
}
}
