package com.csi.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo5 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/jdbc2";
	String username="root";
	String password="system";
	Connection con=DriverManager.getConnection(url,username,password);
	PreparedStatement ps=con.prepareStatement("update Employee set name=? where id=?");
	ps.setString(1, "Osama");
	ps.setInt(2, 1033);
	int i=ps.executeUpdate();
	System.out.println(i+" "+"record updated successfully");
}
}
