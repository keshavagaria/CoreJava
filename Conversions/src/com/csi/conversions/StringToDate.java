package com.csi.conversions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
public static void main(String[] args) throws ParseException {
	//String -> Date
	String s="26-07-1992";
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date d=sdf.parse(s);
	System.out.println(sdf.format(d));
	
	//Date -> String
	Date dd=new Date();
	SimpleDateFormat sdf2=new SimpleDateFormat("dd/MM/yyyy");
	String s2=sdf2.format(dd);
	System.out.println(s2);
}
}
