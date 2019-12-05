package com.csi.date;

import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Locale;

public class DateDemo2 {
public static void main(String[] args) {
	//Date - > String
	Date d=new Date(26-07-1992);
	SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	System.out.println(sdf.format(d));
			}
}
