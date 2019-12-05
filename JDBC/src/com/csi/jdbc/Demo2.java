package com.csi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");       //1. Load Driver
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc2","root","system"); //2. Get Connection
	Statement stmt=con.createStatement();  //3. Create Statement
	ResultSet rs=stmt.executeQuery("select * from Employee"); //4. Execute Queries
	while(rs.next())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getFloat(5)+ " "+rs.getDate(6));
	}
	con.close();   //5. Close Connection
}
}
