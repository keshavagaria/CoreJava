package com.csi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
//import java.util.Date;
public class Demo3 {
public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","system");
	PreparedStatement ps=con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
	ps.setInt(1, 107);
	ps.setString(2, "Osama");
	ps.setString(3, "Iraq");
	ps.setLong(4, 11111111);
	ps.setFloat(5, 9000.25f);
	//Date date=new Date(26-10-1984);
	String s="09-11-2001";
	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
      java.util.Date 	date = sdf.parse(s);
	
	    long l=date.getTime();
		java.sql.Date dd=new java.sql.Date(l);
	
	ps.setDate(6,  dd);
	int i=ps.executeUpdate();
	System.out.println(i+" "+"record updated");
	con.close();
}
}
