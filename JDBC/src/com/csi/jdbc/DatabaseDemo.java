package com.csi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","system");
	Statement stmt=con.createStatement();
	ResultSet rs=stmt.executeQuery("select * from student");
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	}
	con.close();
}
}
