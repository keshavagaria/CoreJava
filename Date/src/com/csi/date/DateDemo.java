package com.csi.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
public static void main(String[] args) throws ParseException {
	
	String s="26-07-1992";
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	Date date=sdf.parse(s);
	System.out.println(sdf.format(date));
}
}
